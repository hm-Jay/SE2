package logic;

import java.util.ArrayList;
import java.util.List;

public class Sparplanrechner {
    public List<String> sparplanBerechnen(double startkapital, double monatlicheSparrate, double zinsatzProzent, int laufzeitJahre) {
        List<String> jahresübersicht = new ArrayList<>();
        double kapital = startkapital;
        double monatszins = zinsatzProzent / 100.0 / 12.0;
        int gesamtMonate = laufzeitJahre * 12;

        for (int monat = 1; monat <= gesamtMonate; monat++) {
            kapital += monatlicheSparrate;           // Einzahlung
            kapital += kapital * monatszins;         // Zinsen

            String eintrag = String.format("Monat %02d: Kapital = %.2f €", monat, kapital);
            jahresübersicht.add(eintrag);
        }

        return jahresübersicht;
    }
}
