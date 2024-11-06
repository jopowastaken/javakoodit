package kuviot;

public abstract class Kuvio {

    private double x, y;
    protected String teksti = "start";

    public Kuvio(double x, double y, String teksti) {
        this.x = x;
        this.y = y;
        this.setTeksti(teksti);
    }

    public void setTeksti(String teksti) {
        if (teksti == null)
            this.teksti = "";
        else
            this.teksti = teksti;
    }

    protected String keskipisteMj() {
        return "(" + x + ", " + y + ")";
    }

    public abstract double ala();

}