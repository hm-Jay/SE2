package gui;

import javax.swing.*;

public class GuiLogic {
    public static void showMainForm(){
        SwingUtilities.invokeLater(() -> {
            BreakEvenForm form = new BreakEvenForm();
            JFrame frame = new JFrame("Break-Even-Rechner");
            frame.setContentPane(form.getMainPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
