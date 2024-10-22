package teht2;
//notes
//Koodailin liian lähellä aurinkoa. Jos intellij värittää että koodistä pitää ottaa psvm pois. älä luota siihen.
//Menee kaikki ihan levälleen jos teet sillai.
public class teht2 {
    public static void main(String[] args) {
        testiohjelma();

    }
    public static void testiohjelma(){
        Tili esimerkki1 = new Tili("Koira","12312313",100.0);
        Tili matti = new Tili("Matti","2532234",23);
        System.out.println(matti);
        System.out.println(esimerkki1);
        matti.saldo += 12;
        System.out.println("Matin saldo "+matti.saldo);
        esimerkki1.saldo += 20.0;
        System.out.println(esimerkki1);
        matti.saldo += 2;
        System.out.println("Matin saldo "+matti.saldo);
        esimerkki1.saldo -=15.0;
        System.out.println(esimerkki1);
        System.out.println(matti);

    }
    //en tiiä oliko ton Tili luokan tarkotus olla static mut tää ei suostunu compileen ilman et vaihdoin sen
    //staticiks en jaksa ymmärtää. Anne tai Annukka pliis selittäkää.
    public static class Tili {
        private String omistaja;
        private String tilinumero;
        private double saldo;

        public Tili(String omistaja, String tilinumero, double saldo) {
            this.omistaja = omistaja;
            this.tilinumero = tilinumero;
            this.saldo = saldo;
        }

        public void pano(double maara) {
            this.saldo = this.saldo + maara;
        }

        public void otto(double maara) {
            this.saldo = this.saldo - maara;
        }

        public double saldo() {
            return this.saldo;
        }

        @Override
        public String toString() {
            return this.omistaja + ", tilinumero: " + this.tilinumero + ", saldo: " + this.saldo;
        }
    }

}
