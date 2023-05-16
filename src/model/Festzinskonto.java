package model;

public class Festzinskonto extends Sparkonto {
    private int laufzeit;
    private int abgelaufeneZeit;

    public Festzinskonto(int kontonummer, String name, double kontostand,
                         double zinssatz,int laufzeit, int abgelaufeneZeit) {
        super(kontonummer, name, kontostand, zinssatz);
        this.laufzeit = laufzeit;
        this.abgelaufeneZeit = abgelaufeneZeit;
    }

    @Override
    public void abheben(double betrag) {
        if (abgelaufeneZeit >= laufzeit) {
            super.abheben(betrag);
        }
    }

    @Override
    public void zinsenAusschütten() {
        if (abgelaufeneZeit < laufzeit) {
            super.zinsenAusschütten();
            abgelaufeneZeit++;
        }
    }
}
