package teht2;

public class Elokuva {
    private String nimi;
    private int julkaisuvuosi;
    private String genre;
    private int ikaraja;

    public Elokuva(String nimi, int julkaisuvuosi, String genre, int ikaraja) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.genre = genre;
        this.ikaraja = ikaraja;
    }
    public String nimi(){
        return nimi;
    }
    public boolean saakoKatsoa(int ika){
        return ika > ikaraja;
    }
}
