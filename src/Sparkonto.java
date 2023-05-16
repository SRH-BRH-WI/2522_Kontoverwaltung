public class Sparkonto extends Konto{
    private static double gebühren;
    private double zinssatz;
    public Sparkonto(int kontonr, String name, double guthaben,double gebühren, double zinssatz) {
        super(kontonr, name, guthaben);
        this.gebühren=gebühren;
        this.zinssatz=zinssatz;
    }

    public static double getGebühren() {
        return gebühren;
    }

    public double getZinssatz() {
        return zinssatz;
    }
}
