package teht1;
import Kaluja.*;

public class teht4_5 {
    public static void main(String[] args) {
        LaskeLukuja();

    }


    public static void LaskeLukuja() {
        int miinus = 0;
        int parillisia = 0;
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
        }
        System.out.println("Negatiivisia lukuja: "+miinus);
        System.out.println("Parillisia lukuja: "+parillisia);
    }

    public static boolean TarkistaNegatiivisuus(int luku) {
        return luku < 0;

    }

    public static boolean TarkistaParillisuus(int luku) {
        return luku%2 == 0;

    }
}








