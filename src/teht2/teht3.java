package teht2;

public class teht3 {
    public static void main(String[] args) {


    }
    public class Luokkahuone{
        private String luokanKoodi;
        private int istumapaikat;

        public Luokkahuone(String luokanKoodi, int istumapaikat){
            this.luokanKoodi = luokanKoodi;
            this.istumapaikat = istumapaikat;

        }
        public String getLuokanKoodi() {
            return luokanKoodi;
        }

        public int getIstumapaikat() {
            return istumapaikat;
        }
    }

}
