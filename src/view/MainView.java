package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private JButton buttonAnzeigen;
    private JTextField textfieldKontonummer, textfieldInhaber, textfieldKontostand;

    public MainView() {
        setTitle("Kontoverwaltung");
        setSize(600, 400);
        setLayout( new BorderLayout() );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );

        // Ebene 1
        JPanel centerPanel = new JPanel( new GridLayout(3,2) );
        centerPanel.setBorder( new EmptyBorder(5,5,5,5) );
        JPanel southPanel =  new JPanel( new FlowLayout() );
        add( centerPanel, BorderLayout.CENTER );
        add( southPanel, BorderLayout.SOUTH );

        // Ebene 2
        centerPanel.add( new JLabel("Kontonummer:") );
        textfieldKontonummer = new JTextField();
        centerPanel.add( textfieldKontonummer );
        centerPanel.add( new JLabel("Inhaber:") );
        textfieldInhaber = new JTextField();
        centerPanel.add( textfieldInhaber );
        centerPanel.add( new JLabel("Kontostand:") );
        textfieldKontostand = new JTextField();
        centerPanel.add( textfieldKontostand );

        buttonAnzeigen = new JButton("Anzeigen");
        southPanel.add( buttonAnzeigen );
        southPanel.add( new JButton("Löschen") );
        southPanel.add( new JButton("Neu") );

        setVisible(true);
        pack();
    }

    public void setButtonAnzeigenActionListener(ActionListener listener) {
        buttonAnzeigen.addActionListener(listener);
    }

    public int getKontonummer() {
        // Achtung, Fehler (vom Anwender) werden hier erstmal ignoriert
        return Integer.parseInt( textfieldKontonummer.getText() );
    }

    public void setInhaber(String inhaber) {
        textfieldInhaber.setText(inhaber);
    }

    public void setKontostand(double kontostand) {
        textfieldKontostand.setText( String.valueOf(kontostand) );
    }

    public static void main(String[] args) {
        new MainView();
    }
}
