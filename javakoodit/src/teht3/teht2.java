package teht3;

import java.util.ArrayList;
import java.util.Date;

public class teht2 {
    public static void main(String[] args) {
        Elokuva elokuva1 = new Elokuva("Tenet", 2020, "Sci-Fi", 13);
        Elokuva elokuva2 = new Elokuva("Spider-Man: No Way Home", 2021, "Action", 12);
        Elokuva elokuva3 = new Elokuva("The Dark Knight", 2008, "Action", 14);
        Elokuva elokuva4 = new Elokuva("Dune", 2021, "Sci-Fi", 12);

        ArrayList<Elokuva> elokuvatlistassa = new ArrayList<Elokuva>();
        elokuvatlistassa.add(elokuva1);
        elokuvatlistassa.add(elokuva2);
        elokuvatlistassa.add(elokuva3);
        elokuvatlistassa.add(elokuva4);

        tulostaUudet(elokuvatlistassa);
        tulosaVanhat(elokuvatlistassa);

    }

    public static void tulostaUudet(ArrayList<Elokuva> lista) {
        System.out.println("Tulostetaan viim 5 vuoden sisällä tulleet elokuvat");
        for (Elokuva i : lista) {
            if ((2024 - i.getJulkaisuvuosi()) <= 5) {
                System.out.println(i);
            }
        }
    }
    public static void tulosaVanhat(ArrayList<Elokuva> lista){
        System.out.println("Tulostetaan vanhemmat leffat");
        for (Elokuva i:lista){
            if((2024-i.getJulkaisuvuosi())>5){
                System.out.println(i);
            }
        }
    }
}

