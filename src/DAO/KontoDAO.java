package DAO;

import model.Konto;
import java.util.List;

/*
 * Interface (wie eine abstrakte Klasse):
 * - enthält keine Attribute (normalerweise)
 * - enthält nur Methodenköpfe (ohne Implementierung)
 * - kann Konstanten enthalten (static final)
 */
public interface KontoDAO {

    // Umsetzung von CRUD

    // Create
    boolean insertKonto(Konto k);

    // Read
    Konto getKontoByKontonummer( int kontonummer );

    // wir hätten gerne ein dynamisches Array
    // wie geht das: Konto[?] <- geht nicht
    // es müsste über eine Klasse geregelt werden: KontoArray <- müsste selbst erstellt werden
    // Array mit flexiblem Datentyp ? -> gibt es mit Generics (bzw. Template)
    // -> Array<Konto> <- jetzt kennt die Klasse den Datentyp
    // es heißt aber "List"
    List<Konto> getAlleKonten();

    // Update
    boolean updateKonto( int kontonummer, Konto k );

    // Delete
    boolean deleteKonto( int kontonummer );

    // Management
    int letzteAktuelleKontonummer();
}
