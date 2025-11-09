package atividades.poo;

import javax.swing.JOptionPane;

public class ItbiCalculadora {
    public static void main(String[] args) {
        try {
            String vTransacaoStr = JOptionPane.showInputDialog(null, "Valor de transação do imóvel:");
            String vVenalStr = JOptionPane.showInputDialog(null, "Valor venal do imóvel:");
            String percentualStr = JOptionPane.showInputDialog(null, "Porcentagem do ITBI (%):");

            if (vTransacaoStr == null || vVenalStr == null || percentualStr == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }

            double vTransacao = Double.parseDouble(vTransacaoStr);
            double vVenal = Double.parseDouble(vVenalStr);
            double percentual = Double.parseDouble(percentualStr);

            double base = Math.max(vTransacao, vVenal);
            double imposto = base * (percentual / 100.0);

            JOptionPane.showMessageDialog(null,
                    String.format("Base de cálculo: R$ %.2f\nITBI devido: R$ %.2f", base, imposto));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Use números válidos.");
        }
    }
}