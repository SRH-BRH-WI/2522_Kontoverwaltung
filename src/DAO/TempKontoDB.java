package DAO;

import model.Girokonto;
import model.Konto;

import java.util.ArrayList;
import java.util.List;

public class TempKontoDB implements KontoDAO {

    // unsere interne in-memory Datenbank
    private List<Konto> kontenList = new ArrayList<>();

    public TempKontoDB() {
        insertKonto( new Girokonto(1, "Mr. Giro", 500, 350) );
    }

    @Override
    public boolean insertKonto(Konto k) {
        Konto tmp = getKontoByKontonummer( k.getKontonummer() );
        if (tmp != null) return false; // Diese Kontonummer gibt es bereits
        kontenList.add( k.clone() );
        return true;
    }

    @Override
    public Konto getKontoByKontonummer(int kontonummer) {
        for (int i=0; i < kontenList.size(); i++ ) {
            if (kontenList.get(i).getKontonummer() == kontonummer)
                return kontenList.get(i).clone();
        }
        return null;
    }

    @Override
    public List<Konto> getAlleKonten() {
        List<Konto> copyList = new ArrayList<>( kontenList.size() );
        for (int i=0; i < kontenList.size(); i++ ) {
            copyList.add( kontenList.get(i).clone() );
        }
        return copyList;
        // so auf keinen Fall (ist ein Getter) und jeder kann unsere Datenbank verändern
        // return kontenList;
    }

    @Override
    public boolean updateKonto(int kontonummer, Konto k) {
        deleteKonto(kontonummer);
        return insertKonto(k);
    }

    @Override
    public boolean deleteKonto(int kontonummer) {
        for (int i=0; i < kontenList.size(); i++ ) {
            if (kontenList.get(i).getKontonummer() == kontonummer) {
                kontenList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int letzteAktuelleKontonummer() {
        return 0;
    }
}
