package teht2;

public class teht9 {
    public static void main(String[] args) {
        Maksukortti liisaKortti = new Maksukortti("Liisa", 20.0);
        Maksukortti nuuttiKortti = new Maksukortti("Nuutti", 50.0);

        liisaKortti.syoMaukaslounas();
        nuuttiKortti.syoHalpalounas();

        System.out.println(liisaKortti);
        System.out.println(nuuttiKortti);

        liisaKortti.lisaaSaldoa(10.0);
        nuuttiKortti.syoMaukaslounas();

        System.out.println(liisaKortti);
        System.out.println(nuuttiKortti);

        liisaKortti.syoMaukaslounas();
        liisaKortti.syoMaukaslounas();
        nuuttiKortti.lisaaSaldoa(50.0);

        System.out.println(liisaKortti);
        System.out.println(nuuttiKortti);

        liisaKortti.syoMaukaslounas();
        liisaKortti.syoHalpalounas();
        nuuttiKortti.syoHalpalounas();

        System.out.println(liisaKortti);
        System.out.println(nuuttiKortti);

        nuuttiKortti.lisaaSaldoa(-50.0);
        liisaKortti.lisaaSaldoa(10.0);

        System.out.println(liisaKortti);
        System.out.println(nuuttiKortti);
    }
}

