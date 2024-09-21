package teht2;

public class teht7 {
    public static void main(String[] args) {
        Elokuva lef0 = new Elokuva("Epic Battle", 2024, "Action", 18);
        Elokuva lef1 = new Elokuva("The Great Adventure", 2023, "Action", 12);
        System.out.println("Voiko 12v katsoa "+lef0.nimi()+"?");
        System.out.println(lef0.saakoKatsoa(12));
        System.out.println("Voiko 12v katsoa "+lef1.nimi()+"?");
        System.out.println(lef1.saakoKatsoa(12));

    }
}
// 6 Elokuva
// Luo luokka Elokuva ja lisää sille seuraavat ominaisuudet:
// String nimi
// int julkaisuvuosi
// String genre
// int ikaraja
// Tee luokalle konstruktori sekä metodit public String nimi(), joka palauttaa elokuvan nimen, ja public boolean saakoKatsoa(int ika),
// joka palauttaa tiedon siitä, saako käyttäjä katsoa elokuvan. Piirrä Elokuva-luokasta luokka diagrammi.
// Ohjelman pitäisi toimia jotakuinkin näin:
// import java.util.Scanner;