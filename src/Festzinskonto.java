public class Festzinskonto extends Sparkonto{
    private int laufzeit;
    private int abgelaufeneZeit;
    public Festzinskonto(int kontonr, String name, double guthaben, double gebühren,
                         double zinssatz,int laufzeit, int abgelaufeneZeit) {
        super(kontonr, name, guthaben, gebühren, zinssatz);
        this.laufzeit=laufzeit;
        this.abgelaufeneZeit=abgelaufeneZeit;
    }
}
