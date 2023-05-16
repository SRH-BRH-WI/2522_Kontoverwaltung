public abstract class Konto {
    private int kontonr;
    private String inhaber;
    private double kontostand;

    public Konto(int kontonr, String inhaber, double guthaben) {
        this.kontonr = kontonr;
        this.inhaber = inhaber;
        this.kontostand = guthaben;
    }

    public int getKontonr() {
        return kontonr;
    }
    public double getGuthaben() {
        return kontostand;
    }
    public String getInhaber() {
        return inhaber;
    }
    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void einzahlen(double betrag){
        this.kontostand =getGuthaben()+betrag;
    }
    public void abheben(double betrag){
        this.kontostand =getGuthaben()-betrag;
    }

    public void zinsenAusschütten(double zinssatz){
        double zinsen=getGuthaben()*zinssatz/100;
        this.kontostand =getGuthaben()+zinsen;
    }
}
