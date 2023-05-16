public class Girokonto extends Konto{

    private static double gebühren;
    private double dispokredit;
    public Girokonto(int kontonr, String name, double guthaben, double gebühren, double dispokredit) {
        super(kontonr, name, guthaben);
        this.gebühren=gebühren;
        this.dispokredit=dispokredit;
    }

    public static double getGebühren() {
        return gebühren;
    }

    public double getDispokredit() {
        return dispokredit;
    }
}
