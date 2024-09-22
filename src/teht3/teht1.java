package teht3;
import Kaluja.*;

import java.util.ArrayList;

public class teht1 {
    public static void main(String[] args) {
        nimetListaan();
        numeroListaan();

    }

    public static void nimetListaan(){
        ArrayList<String> lista = new ArrayList<String>();
        while(true){
            String teksti = TeLu.Lukija();
            if(teksti == ""){
                break;
            }
            lista.add(teksti);
        }
        System.out.println(lista.get(1));
    }
    public static void numeroListaan(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        while(true){
            int num = NumLu.Lukija();
            if(num == -99){
                break;
            }
            lista.add(num);
        }
        int sum = 0;
        for(int i:lista){
            sum += i;
        }
        System.out.println("Listan Summa on: "+ sum);
        System.out.println("Listan keskiarvo on: " + (sum/lista.size()));
        lista.sort(null);
        System.out.println("Listan pienin numero on: "+ lista.getFirst());
        System.out.println("Listan isoin numero on: "+ lista.getLast());
    }
}
