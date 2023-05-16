package model;

public abstract class Konto {
    private final int kontonummer;
    private String inhaber;
    private double kontostand;

    public Konto(int kontonummer, String inhaber, double kontostand) {
        this.kontonummer = kontonummer;
        this.inhaber = inhaber;
        this.kontostand = kontostand;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void einzahlen(double betrag){
        this.kontostand += betrag;
    }

    public void abheben(double betrag){
        this.kontostand -= betrag;
    }

    public abstract void zinsenAusschütten();
}
