package controller;

import model.Girokonto;
import org.junit.Assert;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
    }

    @Test
    public void TestFürGirokonten() {
        Girokonto giro = new Girokonto(1, "Mr. Giro", 500, 350);

        Assert.assertEquals("Check der Kontonummer", 1, giro.getKontonummer() );
        Assert.assertEquals("Check vom Inhaber", "Mr. Giro", giro.getInhaber());
    }
}