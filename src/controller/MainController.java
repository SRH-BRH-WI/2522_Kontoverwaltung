package controller;

import DAO.KontoDAO;
import DAO.TempKontoDB;
import model.Konto;
import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    private MainView mainView;
    private KontoDAO kontoDB;

    public MainController(MainView mainView, KontoDAO kontoDB) {
        this.mainView = mainView;
        this.kontoDB = kontoDB;

        mainView.setButtonAnzeigenActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Konto konto = kontoDB.getKontoByKontonummer(mainView.getKontonummer());
                // Achtung, Prüfung ob es das Konto überhaupt gibt, fehlt noch
                mainView.setInhaber( konto.getInhaber() );
                mainView.setKontostand( konto.getKontostand() );
            }
        });
    }

    public static void main(String[] args) {
        new MainController( new MainView(), new TempKontoDB() );
    }
}
