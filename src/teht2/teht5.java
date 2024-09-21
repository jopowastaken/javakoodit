package teht2;
import Kaluja.*;

public class teht5 {
    public static void main(String[] args) {
        elukka[] elukkaList = {
                new elukka("Rakki", "dog", "Hau", "Brown"),
                new elukka("Milo", "cat", "Meow", "Gray"),
                new elukka("Bella", "dog", "Woof", "Black"),
                new elukka("Charlie", "sheep", "Baa", "White"),
                new elukka("Max", "cow", "Moo", "Spotted")
        };

        tulostaelukat(elukkaList);
        satunnaistaAantelya(elukkaList);
        satunnaistaAantelya(elukkaList);
        satunnaistaAantelya(elukkaList);



    }

    public static void tulostaelukat(elukka[] e){
        for (elukka i:e){
            System.out.println(i.toString());
        }
    }

    public static void satunnaistaAantelya(elukka[] e){
        int num = Rando.numero(0,e.length);
        System.out.println(e[num].getSound()+" sanoo "+e[num].getElukkaName());
    }



}
