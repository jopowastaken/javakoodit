package Kaluja;
import java.util.ArrayList;
import java.util.Random;
public class Rando {
    public static int numero(){
        Random rand = new Random();
        return rand.nextInt();
    }
    public static String TekstiListasta(ArrayList<String> lista){
        Random rand = new Random();
        return lista.get(rand.nextInt(0,lista.size()));
    }
}
