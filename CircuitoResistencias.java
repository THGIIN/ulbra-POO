package atividades.poo;

import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a resistência 1 (ohms): ");
        double r1 = sc.nextDouble();
        System.out.print("Informe a resistência 2 (ohms): ");
        double r2 = sc.nextDouble();
        System.out.print("Informe a resistência 3 (ohms): ");
        double r3 = sc.nextDouble();
        System.out.print("Informe a resistência 4 (ohms): ");
        double r4 = sc.nextDouble();

        double equivalente = r1 + r2 + r3 + r4;
        double maior = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        double menor = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        System.out.printf("Resistência equivalente: %.2f ohms%n", equivalente);
        System.out.printf("Maior resistência: %.2f ohms%n", maior);
        System.out.printf("Menor resistência: %.2f ohms%n", menor);

        sc.close();
    }
}