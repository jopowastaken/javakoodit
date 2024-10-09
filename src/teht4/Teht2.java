package teht4;

public class Teht2 {

    public static void main(String[] args) {
        addTogether(2, "Pekka"); //addTogether-metodi tulostaa 2Pekka
        addTogether("Kissa", 3); //addTogether-metodi tulostaa Kissa3
        addTogether("Kaali", "mato"); // addTogether-metodi tulostaa Kaalimato
        addTogether(3, 4); //addTogether-metodi tulostaa 7

    }
    public static void addTogether(String nimi, int num){
        System.out.println(nimi+num);

    }
    public static void addTogether(int num1, int num2){
        System.out.print(num1);
        System.out.print(num2);
    }
    public static void addTogether(String nimi, String nim2){
        System.out.println(nimi+ nim2);
    }public static void addTogether(int num, String nimi ){
        System.out.println(num+nimi);
    }



}
