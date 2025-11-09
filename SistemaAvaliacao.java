package atividades.poo;

import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        try {
            String prova1Str = JOptionPane.showInputDialog(null, "Nota da Prova 1:");
            String prova2Str = JOptionPane.showInputDialog(null, "Nota da Prova 2:");
            String trabalhoStr = JOptionPane.showInputDialog(null, "Nota do Trabalho:");

            if (prova1Str == null || prova2Str == null || trabalhoStr == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }

            double p1 = Double.parseDouble(prova1Str);
            double p2 = Double.parseDouble(prova2Str);
            double trab = Double.parseDouble(trabalhoStr);

            double media = (p1 + p2 + trab) / 3.0;
            String status = media >= 6.0 ? "Aprovado" : "Reprovado";

            JOptionPane.showMessageDialog(null,
                    String.format("Média: %.2f\nStatus: %s", media, status));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Use números válidos.");
        }
    }
}