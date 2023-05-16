package model;

public class Girokonto extends Konto{
    private static final double GIRO_GEBÜHREN = 0.1;
    private final double dispokredit;

    public Girokonto(int kontonummer, String inhaber, double kontostand, double dispokredit) {
        super(kontonummer, inhaber, kontostand);
        this.dispokredit = dispokredit;
    }

    public static double getGebühren() {
        return GIRO_GEBÜHREN;
    }

    public double getDispokredit() {
        return dispokredit;
    }

    @Override
    public void zinsenAusschütten() {
    }
}