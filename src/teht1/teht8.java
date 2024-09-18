package teht1;
import Kaluja.*;

import java.util.HashMap;

public class teht8 {
    public static void main(String[] args) {
        HashMap<Integer,String> kone = AlustaKone();
        int koneenvoitot = 0;
        int pelaajavoitot = 0;
        while (true) {
            System.out.print("Anna valinta Kivi, Paperi tai Sakset: ");
            String valinta = TeLu.Lukija();
            boolean tulos = Boolean.TRUE.equals(peli(valinta, kone));


        }


    }
    public static Boolean peli (String valinta,HashMap<Integer, String> kone){
        String koneenvalinta = kone.get(Rando.numero(1,kone.size()));
        if (koneenvalinta.equals(valinta)) {
            System.out.println("Tasapeli!");
            return null;
        }

        if ((valinta.equals("Kivi") && koneenvalinta.equals("Sakset")) ||
                (valinta.equals("Sakset") && koneenvalinta.equals("Paperi")) ||
                (valinta.equals("Paperi") && koneenvalinta.equals("Kivi"))) {
            return true;
        } else {
            return false;
        }


    }

    public static HashMap<Integer,String> AlustaKone(){
        HashMap <Integer, String> kone = new HashMap<Integer,String>();
        kone.put(1,"Kivi");
        kone.put(2,"Sakset");
        kone.put(3,"Paperi");
        return kone;
    }
}
