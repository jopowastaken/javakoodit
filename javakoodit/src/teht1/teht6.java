package teht1;

import Kaluja.NumLu;

public class teht6 {

        public static void main(String[] args) {
            LaskeLukuja();

        }


        public static void LaskeLukuja() {
            int miinus = 0;
            int parillisia = 0;
            int kolmoistensum = 0;
            while (true) {
                int annettuluku = NumLu.Lukija();
                if (annettuluku == 0) {
                    break;
                }
                if (TarkistaNegatiivisuus(annettuluku)) {
                    miinus++;
                }
                if (TarkistaParillisuus(annettuluku)) {
                    parillisia++;
                }
                if (TarkistaKolmoisuus(annettuluku)) {
                    if(annettuluku>0){
                        kolmoistensum += annettuluku;
                    }
                }
            }
            System.out.println("Negatiivisia lukuja: "+miinus);
            System.out.println("Parillisia lukuja: "+parillisia);
            System.out.println("Kolmella jaollisten positiivisten kokonaislukujen summa: "+kolmoistensum);
        }

        public static boolean TarkistaNegatiivisuus(int luku) {
            return luku < 0;

        }

        public static boolean TarkistaParillisuus(int luku) {
            return luku%2 == 0;

        }
        public static boolean TarkistaKolmoisuus(int luku) {
            return luku%3 == 0;

        }

    }










