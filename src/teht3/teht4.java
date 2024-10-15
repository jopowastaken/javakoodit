package teht3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class teht4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println(new File(".").getAbsolutePath());
        ArrayList<JalkapalloTulokset> tulokset = lueTulokset();
        while (true){
            try{
                System.out.println("1:tulostaa listan peleistä. 2:Tulostaa pelin tuloksen 3:Lopettaa");
                int valinta=sc.nextInt();


                switch (valinta) {
                    case 1:
                        int x = 0;
                        for (JalkapalloTulokset i: tulokset){
                            System.out.println(STR."\{x} \{i.getJoukkue1()}-\{i.getJoukkue2()}");
                            x++;
                        }
                        break;
                    case 2:
                        try{
                            System.out.println(STR."Minkä pelin tuloksen haluat tietää 0-\{tulokset.size()-1}");
                            int pelivalinta= sc.nextInt();
                            System.out.println(STR."Voittaja on! \{tulokset.get(pelivalinta).getVoittaja()}");

                        }catch (InputMismatchException | IndexOutOfBoundsException e) {
                            System.out.println("Numero jonka syötit ei ole numero tai sitä ei löydy listasta!");
                            sc.next();
                        };
                        break;
                    case 3:
                        System.out.println("Ohjelma lopetetaan.");
                        sc.close();
                        return;
                    default:
                        System.out.println("Virheellinen valinta. Valitse numero 1, 2 tai 3.");
                }

            }catch (InputMismatchException e) {
                System.out.println("Numero jonka syötit ei ole numero!");
                sc.next();
            };


        }

    }
    public static ArrayList<JalkapalloTulokset> lueTulokset() throws FileNotFoundException {
        ArrayList<JalkapalloTulokset> lista = new ArrayList<>();
        Scanner lukija = new Scanner(new File("Football_statistics.txt"));
        while (lukija.hasNextLine()){
            String[] teksti = lukija.nextLine().split(", ");
            String joukkue1= teksti[0];
            String joukkue2= teksti[1];
            int joukkue1pisteet = parseInt(teksti[2]);
            int joukkue2pisteet= parseInt(teksti[3]);
            lista.add(new JalkapalloTulokset(joukkue1,joukkue2,joukkue1pisteet,joukkue2pisteet));

            }
        return lista;




    }


}
