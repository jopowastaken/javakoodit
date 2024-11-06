package rekisteri;

import rekisteri.henkilot.Henkilo;
import rekisteri.kayttoliittyma.Kayttoliittyma;


public class Main {
    public static void main(String[] args) {
        Henkilo henk1 = new Henkilo("Kalle", 23);
        Henkilo henk2 = new Henkilo("Solee", 233);
        Henkilo henk3 = new Henkilo("Alle", 223);
        Kayttoliittyma.naytaHenkilo(henk1);
        Kayttoliittyma.naytaHenkilo(henk2);
        Kayttoliittyma.naytaHenkilo(henk3);
    }
}
