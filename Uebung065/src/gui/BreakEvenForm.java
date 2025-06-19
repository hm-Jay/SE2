package gui;

import logic.BreakevenAnalyse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BreakEvenForm {
    private JPanel mainPanel;
    private JTextField textFieldFixkosten;
    private JTextField textFieldVariableKosten;
    private JTextField textFieldVerkaufspreis;
    private JButton buttonBerechnen;
    private JTextArea textAreaAusgabe;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public BreakEvenForm() {
        buttonBerechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fixkosten = Double.parseDouble(textFieldFixkosten.getText());
                    double variableKosten = Double.parseDouble(textFieldVariableKosten.getText());
                    double vkPreis = Double.parseDouble(textFieldVerkaufspreis.getText());

                    BreakevenAnalyse analyse = new BreakevenAnalyse();
                    int breakEven = analyse.berechneBreakEven(fixkosten, variableKosten, vkPreis);
                    List<String> zeilen = analyse.generiereKostenErlösTabelle(fixkosten, variableKosten, vkPreis, breakEven + 5);

                    textAreaAusgabe.setText("Break-Even-Stückzahl: " + breakEven + "\n\n");
                    for (String z : zeilen) {
                        textAreaAusgabe.append(z + "\n");
                    }

                } catch (Exception ex) {
                    textAreaAusgabe.setText("Bitte gültige Zahlen eingeben!");
                }
            }
        });
    }
}
