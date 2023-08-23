package controller;

import DAO.KontoDAO;
import DAO.TempKontoDB;
import model.Konto;
import view.MainView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    private MainView mainView;
    private KontoDAO kontoDB;

    public MainController(MainView mainView, KontoDAO kontoDB) {
        this.mainView = mainView;
        this.kontoDB = kontoDB;

        // (2) Anonyme Klasse
        mainView.setButtonAnzeigenActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Konto konto = kontoDB.getKontoByKontonummer(mainView.getKontonummer());
                // Achtung, Prüfung ob es das Konto überhaupt gibt, fehlt noch
                mainView.setInhaber( konto.getInhaber() );
                mainView.setKontostand( konto.getKontostand() );
            }
        });

        // (3) Lambda Ausdruck
//        mainView.setButtonLöschenActionListener( (e) -> mainView.dispose() );

        // (4) Funktionales Interface über eigene Klasse
        //     (wird unser Standard werden)
        mainView.setButtonLöschenActionListener( this::löschenButtonPerformed );
    }

    public void löschenButtonPerformed(ActionEvent e) {
        if (mainView.confirmDialog("Wirklich löschen?", "Konto wird gelöscht")) {
            mainView.messageDialog("Das Konto wurde gelöscht");
        }
    }

    public static void main(String[] args) {
        new MainController( new MainView(), new TempKontoDB() );
    }
}
