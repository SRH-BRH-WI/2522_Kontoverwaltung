package model;

import model.Konto;

public class Sparkonto extends Konto {
    private static final double SPAR_GEBÜHREN = 0.2;
    private double zinssatz;

    public Sparkonto(int kontonummer, String name, double kontostand, double zinssatz) {
        super(kontonummer, name, kontostand);
        this.zinssatz = zinssatz;
    }

    public static double getGebühren() {
        return SPAR_GEBÜHREN;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    @Override
    public void abheben(double betrag) {
        betrag = Math.abs(betrag) + SPAR_GEBÜHREN;
        if (betrag <= getKontostand()) {
            super.abheben(betrag);
        }
    }

    @Override
    public void zinsenAusschütten() {
        double zinsen = getKontostand() * zinssatz / 100;
        super.einzahlen(zinsen);
    }

    public Konto clone() {
        return new Sparkonto(getKontonummer(), getInhaber(), getKontostand(), zinssatz);
    }
}
