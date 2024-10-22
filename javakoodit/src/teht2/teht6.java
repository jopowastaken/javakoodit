package teht2;

public class teht6 {
    public static void main(String[] args) {
        Luokkahuone luokka1 = new Luokkahuone("C_2013", 30);
        Luokkahuone luokka2 = new Luokkahuone("B_1020", 25);
        Luokkahuone luokka3 = new Luokkahuone("A_1005", 40);
        Luokkahuone luokka4 = new Luokkahuone("D_2031", 20);
        Luokkahuone luokka5 = new Luokkahuone("E_3002", 35);
        Luokkahuone luokka6 = new Luokkahuone("F_1101", 15);

        System.out.println(luokka1.toString());
        System.out.println(luokka2.toString());
        luokka1.varaaPaikka(3);
        luokka2.tulostaTilanne();
        luokka1.tulostaTilanne();


    }

}

// 5 Tyhjät paikat
// Jatketaan Luokkahuone olion parissa. Lisää luokkahuone oliolle kokonaisluku tyyppinen ominaisuus varatutPaikat.
// Luo ensin metodi, joka tulostaa luokkahuoneen tiedot. Lisää sitten Luokkahuone-luokalle metodi, joka varaa luokasta paikan.
// Lisää tämän jälkeen metodi tulostaTilanne(), joka tulostaa kuinka monta paikkaa luokkahuoneessa on vielä jäljellä.


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

// public class Main {
//    public static void main(String[] args) {

//        Elokuva chipmunks = new Elokuva("Alvin and the Chipmunks", 2007, "comedy", 0);

//        Scanner lukija = new Scanner(System.in);

//        System.out.println("Minkä ikäinen olet?");
//        int ika = Integer.parseInt(lukija.nextLine());

//        if (chipmunks.saakoKatsoa(ika)) {
//            System.out.println("Saat katsoa elokuvan " + chipmunks.nimi());
//        } else {
//            System.out.println("Et saa katsoa elokuvaa " + chipmunks.nimi());
//        }

//        Elokuva parasite = new Elokuva("Parasite", 2019, "Drama", 16);

//        System.out.println("Minkä ikäinen olet?");
//        ika = Integer.parseInt(lukija.nextLine());

//        if (parasite.saakoKatsoa(ika)) {
//            System.out.println("Saat katsoa elokuvan " + parasite.nimi());
//        } else {
//            System.out.println("Et saa katsoa elokuvaa " + parasite.nimi());
//        }
//    }
// }

// Ohjelman pitäisi tulostaa jotain tähän suuntaan:
// Minkä ikäinen olet?
// 12
// Saat katsoa elokuvan Alvin and the Chipmunks
// Minkä ikäinen olet?
// 12
// Et saa katsoa elokuvaa Parasite


// 7 Luokkahuone täynnä
// Jatketaan luokkahuoneen parissa. Muuta varaaPaikka metodia siten, että se aina kasvattaa varattujen paikkojen arvoa yhdellä.
// Arvoa ei voi kasvattaa suuremmaksi, kuin luokkahuoneessa on paikkoja.
// Lisää metodi public void poistuuPaikalta(), joka vähentää varattujen paikkojen arvoa aina yhdellä. Arvoa ei muuttaa negatiiviseksi.
// Lisää vielä metodi public boolean taynna(), joka palauttaa true, jos oliomuuttujan varatutPaikat arvo on sama kuin istumapaikat, muutoin metodi palauttaa arvon false.
// Lisää ohjelmaan myös palauttava metodi, joka palauttaa luokan koodin. Ohjelma voisi toimia jotakuinkin näin:
// public class Main {
//    public static void main(String[] args) {
//        LuokkaHuone luokka1 = new LuokkaHuone("B1039", 8, 0);

//        luokka1.tulostaLuokkahuone();

//        while(!luokka1.taynna()) {
//            luokka1.varaaPaikka();
//            luokka1.tulostaTilanne();
//        }

//        if (luokka1.taynna())
//            System.out.println("Luokka täynnä!");

//        luokka1.poistuuPaikalta();
//        luokka1.tulostaTilanne();

//        luokka1.tulostaLuokkahuone();
//    }
// }
// Luokkahuoneen tiedot:
// Tunnus: B1039, Istumapaikkoja yhteensä: 8, Vapaita paikkoja: 8
// Paikkoja varattu: 1
// Paikkoja varattu: 2
// Paikkoja varattu: 3
// Paikkoja varattu: 4
// Paikkoja varattu: 5
// Paikkoja varattu: 6
// Paikkoja varattu: 7
// Paikkoja varattu: 8
// Luokka täynnä!
// Paikkoja varattu: 7
// Luokkahuoneen tiedot:
// Tunnus: B1039, Istumapaikkoja yhteensä: 8, Vapaita paikkoja: 1


// 8 Vielä kerran Luokkahuone
// Lisää Luokkahuone-olioon arvoja palauttava metodi ja arvoja asettava metodi sekä luokanKoodi, että istumapaikat muuttujille.
// Luo nyt uusia olioita ja käytä ohjelmaa luoduilla olioilla. Käytä ohjelmassasi hyväksesi luotuja setter ja getter metodeita esim. seuraavaan tapaan:

// Huom! Kun lisäät setter metodit, muista muuttaa konstruktori niin, että se toimii myös tässä esimerkissä!

// LuokkaHuone luokka2 = new LuokkaHuone(2);
// LuokkaHuone luokka3 = new LuokkaHuone(34);

// luokka2.setIstumapaikat(6);
// luokka2.setLuokanKoodi("B1038");

// luokka3.setLuokanKoodi("Alfa");
// luokka3.setIstumapaikat(50);

// luokka2.tulostaLuokkahuone();
// luokka3.tulostaLuokkahuone();

// luokka2.poistuuPaikalta();
// System.out.print(luokka2.getLuokanKoodi() + ": ");
// luokka2.tulostaTilanne();


// Luokkahuoneen tiedot:
// Tunnus: B1038, Istumapaikkoja yhteensä: 6, Vapaita paikkoja: 4
// Luokkahuoneen tiedot:
// Tunnus: Alfa, Istumapaikkoja yhteensä: 50, Vapaita paikkoja: 16
// B1038: Paikkoja varattu: 1
