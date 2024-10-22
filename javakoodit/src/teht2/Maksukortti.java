package teht2;

public class Maksukortti {
    private String kortinOmistaja;
    private double kortinSaldo;
    private final double maukasLounas = 6.90;
    private final double halpaLounas = 2.95;

    public Maksukortti(String kortinOmistaja, double kortinSaldo) {
        this.kortinOmistaja = kortinOmistaja;
        this.kortinSaldo = kortinSaldo;
    }



    public void syoHalpalounas(){
        if (kortinSaldo<halpaLounas) {
            System.out.println("Saldoa ei ole tarpeeksi");
        }else{
            kortinSaldo -= halpaLounas;
            System.out.println("Veloitettiin tililtä "+ halpaLounas);
        }
    }
    public void syoMaukaslounas(){
        if (kortinSaldo<maukasLounas) {
            System.out.println("Saldoa ei ole tarpeeksi");
        }else{
            kortinSaldo -= maukasLounas;
            System.out.println("Veloitettiin tililtä "+ maukasLounas);
        }
    }

    public void lisaaSaldoa(double i){
        if (i<0){
            System.out.println("Et voi ladata negatiivista määrää rahaa!");
        }else {
            kortinSaldo +=i;
            System.out.println("Kortin saldolle lisätty "+i);
        }
    }


    @Override
    public String toString() {
        return "kortinOmistaja= " + kortinOmistaja  + ", kortinSaldo=" + kortinSaldo;
    }
}
