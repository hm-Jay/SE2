package logic;

import java.util.ArrayList;
import java.util.List;

public class BreakevenAnalyse {

    // Berechnet die Stückzahl, ab der Break-Even erreicht wird
    public int berechneBreakEven(double fixkosten, double variablekosten, double vppe) {
        if (vppe <= variablekosten) {
            throw new IllegalArgumentException("Verkaufspreis muss größer als variable Kosten sein!");
        }
        return (int) Math.ceil(fixkosten / (vppe - variablekosten));
    }

    // Erstellt eine Übersicht für die ersten n Stückzahlen
    public List<String> generiereKostenErlösTabelle(double fixkosten, double variablekosten, double vppe, int maxStück) {
        List<String> tabelle = new ArrayList<>();

        for (int x = 0; x <= maxStück; x++) {
            double gesamtKosten = fixkosten + x * variablekosten;
            double erlös = x * vppe;
            double differenz = erlös - gesamtKosten;

            String zeile = "Stück: " + x +
                    " | Kosten: " + String.format("%.2f", gesamtKosten) +
                    " | Erlös: " + String.format("%.2f", erlös) +
                    " | Differenz: " + String.format("%.2f", differenz);

            tabelle.add(zeile);
        }

        return tabelle;
    }
}
