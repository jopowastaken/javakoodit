package teht1;
import Kaluja.*;

import java.util.HashMap;

public class teht8 {
    public static void main(String[] args) {


    }
    public static Boolean peli (String valinta){
        HashMap<Integer,String> kone = AlustaKone();
        String koneenvalinta = kone.get(Rando.numero());
        if (koneenvalinta.equals(valinta)){

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
