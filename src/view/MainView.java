package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainView extends JFrame {

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
        centerPanel.add( new JTextField() );
        centerPanel.add( new JLabel("Inhaber:") );
        centerPanel.add( new JTextField() );
        centerPanel.add( new JLabel("Kontostand:") );
        centerPanel.add( new JTextField() );

        southPanel.add( new JButton("Anzeigen") );
        southPanel.add( new JButton("Löschen") );
        southPanel.add( new JButton("Neu") );

        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new MainView();
    }
}
