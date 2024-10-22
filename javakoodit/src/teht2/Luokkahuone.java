package teht2;

public class Luokkahuone {
    private String luokanKoodi;
    private int istumapaikat;
    private int varatutPaikat = 0;

    public Luokkahuone(String luokanKoodi, int istumapaikat) {
        this.luokanKoodi = luokanKoodi;
        this.istumapaikat = istumapaikat;
    }

    public void varaaPaikka(int maara){
        this.varatutPaikat += maara;
        System.out.println("Varattiin "+maara+ " paikkaa luokasta "+this.luokanKoodi);
    }

    public void varaaPaikka(){
        if (varatutPaikat==istumapaikat){
            System.out.println(luokanKoodi+" on täynnä!");

        }else{
            this.varatutPaikat++;
            System.out.println("Varattiin paikka luokasta "+this.luokanKoodi);
        }
    }

    public void poistuuPaikalta(){
        if (varatutPaikat==0){
            System.out.println(luokanKoodi+" on tyhjä!");

        }else{
            this.varatutPaikat--;
            System.out.println("1hlö poistui luokasta "+this.luokanKoodi);
        }
    }

    public boolean taynna(){
        return varatutPaikat==istumapaikat;
    }
    public void tulostaTilanne(){
        System.out.println("Luokassa "+this.luokanKoodi+" on "+ (this.istumapaikat-this.varatutPaikat)+" paikkaa jäljellä");

    }

    public void setLuokanKoodi(String luokanKoodi) {
        this.luokanKoodi = luokanKoodi;
    }

    public void setIstumapaikat(int istumapaikat) {
        this.istumapaikat = istumapaikat;
    }

    public void setVaratutPaikat(int varatutPaikat) {
        this.varatutPaikat = varatutPaikat;
    }

    public String getLuokanKoodi() {
        return luokanKoodi;
    }

    public int getIstumapaikat() {
        return istumapaikat;
    }

    public int getVaratutPaikat() {
        return varatutPaikat;
    }

    @Override
    public String toString() {
        return "Luokkahuone{" +
                "luokanKoodi='" + luokanKoodi + '\'' +
                ", istumapaikat=" + istumapaikat +
                ", varatutPaikat=" + varatutPaikat +
                '}';
    }
}

