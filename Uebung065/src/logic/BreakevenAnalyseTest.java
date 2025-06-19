package logic;

import java.util.List;

public class BreakevenAnalyseTest {
    public static void main(String[] args) {
        // Beispielhafte Eingaben
        double fixkosten = 1000;
        double variableKosten = 20;
        double verkaufspreisProEinheit = 50;

        BreakevenAnalyse analyse = new BreakevenAnalyse();

        // Break-Even-Stückzahl berechnen
        int breakEven = analyse.berechneBreakEven(fixkosten, variableKosten, verkaufspreisProEinheit);
        System.out.println("Break-Even-Stückzahl: " + breakEven);

        // Übersicht erstellen
        List<String> tabelle = analyse.generiereKostenErlösTabelle(fixkosten, variableKosten, verkaufspreisProEinheit, breakEven + 50);

        System.out.println("\nKosten-/Erlös-Tabelle:");
        for (String zeile : tabelle) {
            System.out.println(zeile);
        }
    }
}
