package DAO;

import model.Konto;

import java.util.List;

public class TempKontoDB implements KontoDAO {
    @Override
    public boolean insertKonto(Konto k) {
        return false;
    }

    @Override
    public Konto getKontoByKontonummer(int kontonummer) {
        return null;
    }

    @Override
    public List<Konto> getAlleKonten() {
        return null;
    }

    @Override
    public boolean updateKonto(int kontonummer, Konto k) {
        return false;
    }

    @Override
    public boolean deleteKonto(int kontonummer) {
        return false;
    }

    @Override
    public int letzteAktuelleKontonummer() {
        return 0;
    }
}
