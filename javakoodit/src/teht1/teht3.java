package teht1;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class teht3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random rand = new Random();

        Integer[] lista1 = new Integer[10];

        for (int i = 0; i != 10; i++) {
            int arvo = 10;
            lista1[i] = arvo-i;
        }
        System.out.println("integers: "+Arrays.toString(lista1));
        Arrays.sort(lista1);
        System.out.println("integers: "+Arrays.toString(lista1));

        String[] lista2 = {"q", "m", "a", "z", "e", "r", "y", "b", "u", "i", "o", "p", "s", "d", "f", "g", "h", "j", "k", "l", "x", "c", "v", "n", "w", "t"};
        System.out.println("Strings: "+ Arrays.toString(lista2));
        Arrays.sort(lista2);
        System.out.println("Strings: "+ Arrays.toString(lista2));

        Integer[] lista3 = new Integer[10];

        for (int i = 0; i != 10; i++) {
            int arvo = rand.nextInt();
            lista3[i] = arvo;
        }
        System.out.println("Strings: "+ Arrays.toString(lista3));
        Arrays.sort(lista3);
        System.out.println("Strings: "+ Arrays.toString(lista3));

    }

}