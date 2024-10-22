package teht4;

public class juoma {
    private String Nimi;
    private VedenTyyppi tyyppi;

    public String getNimi() {
        return Nimi;
    }

    public VedenTyyppi getTyyppi() {
        return tyyppi;
    }

    public juoma(String nimi, VedenTyyppi tyyppi) {
        Nimi = nimi;
        this.tyyppi = tyyppi;

    }

    @Override
    public String toString() {
        return "juoma{" +
                "Nimi='" + Nimi + '\'' +
                ", tyyppi=" + tyyppi +
                '}';
    }
}
