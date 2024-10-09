package teht4;

import java.util.ArrayList;
import java.util.Scanner;

public class Teht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<juoma> juomaLista = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Lisää juoma");
            System.out.println("2. Poista juoma");
            System.out.println("3. Näytä juomat");
            System.out.println("4. Lopeta");

            System.out.print("Valitse toiminto: ");
            int valinta = Integer.parseInt(scanner.nextLine());

            switch (valinta) {
                case 1:
                    System.out.print("Anna juoman nimi: ");
                    String nimi = scanner.nextLine();

                    System.out.print("Onko juoma kupliva vai hiilihapoton? (SPARKLING/STILL): ");
                    String tyyppiInput = scanner.nextLine().toUpperCase();

                    VedenTyyppi tyyppi;
                    if (tyyppiInput.equals("SPARKLING")) {
                        tyyppi = VedenTyyppi.SPARKLING;
                    } else if (tyyppiInput.equals("STILL")) {
                        tyyppi = VedenTyyppi.STILL;
                    } else {
                        System.out.println("Virheellinen veden tyyppi. Yritä uudelleen.");
                        break;
                    }

                    juoma uusiJuoma = new juoma(nimi, tyyppi);
                    juomaLista.add(uusiJuoma);
                    System.out.println("Juoma lisätty!");
                    break;
                case 2:
                    System.out.println("Anna poistettavan juoman numero:");
                    for (int i = 0; i < juomaLista.size(); i++) {
                        System.out.println((i + 1) + ". " + juomaLista.get(i));
                    }

                    int poistettava = Integer.parseInt(scanner.nextLine()) - 1;

                    if (poistettava >= 0 && poistettava < juomaLista.size()) {
                        juoma poistettuJuoma = juomaLista.remove(poistettava);
                        System.out.println("Poistettu juoma: " + poistettuJuoma.getNimi());
                    } else {
                        System.out.println("Virheellinen numero.");
                    }
                    break;

                case 3:

                    System.out.println("Juomalista:");
                    if (juomaLista.isEmpty()) {
                        System.out.println("Ei juomia.");
                    } else {
                        for (int i = 0; i < juomaLista.size(); i++) {
                            System.out.println((i + 1) + ". " + juomaLista.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Ohjelma lopetetaan.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Virheellinen valinta.");
            }
        }
    }
}
