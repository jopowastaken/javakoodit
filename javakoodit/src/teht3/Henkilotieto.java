package teht3;

public class Henkilotieto {
    private String Nimi;
    private String Sukunimi;
    private int ika;

    public Henkilotieto(String nimi, String sukunimi, int ika) {
        Nimi = nimi;
        Sukunimi = sukunimi;
        this.ika = ika;
    }

    public String getNimi() {
        return Nimi;
    }

    public String getSukunimi() {
        return Sukunimi;
    }

    public int getIka() {
        return ika;
    }

    @Override
    public String toString() {
        return "Henkilotieto" +
                "Nimi: '" + Nimi + '\'' +
                ", Sukunimi: '" + Sukunimi + '\'' +
                ", Ika: " + ika;
    }
}
