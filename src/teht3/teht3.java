package teht3;
import java.util.ArrayList;
import java.util.Scanner;

public class teht3 {
    public static void main(String[] args) {
        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Syötä etunimi (tyhjä lopettaa): ");
            String etunimi = scanner.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }

            System.out.print("Syötä sukunimi: ");
            String sukunimi = scanner.nextLine();

            System.out.print("Syötä ikä: ");
            int ika = Integer.parseInt(scanner.nextLine());


            Henkilotieto henkilo = new Henkilotieto(etunimi, sukunimi, ika);


            henkilotiedot.add(henkilo);
        }

        System.out.println("\nTallennetut henkilötiedot:");
        for (Henkilotieto henkilo : henkilotiedot) {
            System.out.println(henkilo);
        }
    }
}
