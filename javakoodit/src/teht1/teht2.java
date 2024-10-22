package teht1;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class teht2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random rand = new Random();

        Integer[] lista1 = new Integer[10];

        for (int i = 0; i != 10; i++) {
            int arvo = lukija.nextInt();
            lista1[i] = arvo;
        }
        System.out.println("integers: "+Arrays.toString(lista1));

        String[] lista2 = new String[10];

        for (int i = 0; i != 10; i++) {
            String arvo = lukija.nextLine();
            lista2[i] = arvo;
        }
        System.out.println("Strings: "+ Arrays.toString(lista2));

        Integer[] lista3 = new Integer[10];

        for (int i = 0; i != 10; i++) {
            int arvo = rand.nextInt();
            lista3[i] = arvo;
        }
        System.out.println("Strings: "+ Arrays.toString(lista3));

    }

}