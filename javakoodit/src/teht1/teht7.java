package teht1;
import Kaluja.NumLu;
import java.util.ArrayList;
import java.lang.Math;
public class teht7 {
    public static void main(String[] args) {
        int maksimi = NumLu.Lukija();
        ArrayList<Integer> jono = Jonotekija(maksimi);
        System.out.println(jono);
        System.out.println("Numeroiden määrä: "+ LaskeTermit(jono));
        System.out.println("Summa: "+ LaskeYhteen(jono));
        System.out.println("Neliöiden summa: "+ LaskeNeliosumma(jono));

    }

    public static ArrayList<Integer> Jonotekija(int maksimi){
        int luku= 0;
        ArrayList <Integer> jono = new ArrayList<Integer>();
        while (luku+3 < maksimi){
            luku += 3;
            jono.add(luku);
        }
        return jono;
    }

    public static int LaskeTermit(ArrayList <Integer> jono){
        return jono.size();
    }
    public static int LaskeYhteen(ArrayList <Integer> jono) {
        int summa = 0;
        for (Integer i : jono) {
            summa += i;
        }
        return summa;
    }
    public static int LaskeNeliosumma(ArrayList <Integer> jono) {
        int summa = 0;
        for (Integer i : jono) {
            summa += i*i;
        }
        return summa;
    }
}
