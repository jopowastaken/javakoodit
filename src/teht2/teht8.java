package teht2;

public class teht8 {
    public static void main(String[] args) {
        Luokkahuone luokka1 = new Luokkahuone("B1032", 3);
        Luokkahuone luokka2 = new Luokkahuone("B1033", 2);
        Luokkahuone luokka3 = new Luokkahuone("B1034", 5);

        System.out.println("Testataan luokka: " + luokka1.getLuokanKoodi());
        luokka1.varaaPaikka();
        luokka1.varaaPaikka();
        luokka1.varaaPaikka();
        luokka1.varaaPaikka();

        System.out.println();

        System.out.println("Testataan luokka: " + luokka2.getLuokanKoodi());
        luokka2.poistuuPaikalta();
        luokka2.varaaPaikka();
        luokka2.poistuuPaikalta();
        luokka2.poistuuPaikalta();

        System.out.println();

        System.out.println("Testataan luokka: " + luokka3.getLuokanKoodi());
        luokka3.varaaPaikka(2);
        luokka3.tulostaTilanne();
        luokka3.varaaPaikka(3);
        luokka3.varaaPaikka();

    }
}
// 7 Luokkahuone täynnä
// Jatketaan luokkahuoneen parissa. Muuta varaaPaikka metodia siten,
// että se aina kasvattaa varattujen paikkojen arvoa yhdellä.
// Arvoa ei voi kasvattaa suuremmaksi, kuin luokkahuoneessa on paikkoja.
// Lisää metodi public void poistuuPaikalta(), joka vähentää varattujen
// paikkojen arvoa aina yhdellä. Arvoa ei muuttaa negatiiviseksi.
// Lisää vielä metodi public boolean taynna(), joka palauttaa true,
// jos oliomuuttujan varatutPaikat arvo on sama kuin istumapaikat,
// muutoin metodi palauttaa arvon false.
// Lisää ohjelmaan myös palauttava metodi,
// joka palauttaa luokan koodin. Ohjelma voisi toimia jotakuinkin näin:



// 8 Vielä kerran Luokkahuone
// Lisää Luokkahuone-olioon arvoja palauttava metodi ja arvoja asettava metodi sekä luokanKoodi, että istumapaikat muuttujille.
// Luo nyt uusia olioita ja käytä ohjelmaa luoduilla olioilla. Käytä ohjelmassasi hyväksesi luotuja setter ja getter metodeita esim. seuraavaan tapaan:

// Huom! Kun lisäät setter metodit, muista muuttaa konstruktori niin, että se toimii myös tässä esimerkissä!



// Luokkahuoneen tiedot:
// Tunnus: B1038, Istumapaikkoja yhteensä: 6, Vapaita paikkoja: 4
// Luokkahuoneen tiedot:
// Tunnus: Alfa, Istumapaikkoja yhteensä: 50, Vapaita paikkoja: 16
// B1038: Paikkoja varattu: 1
