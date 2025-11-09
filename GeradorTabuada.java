package atividades.poo;

import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para a tabuada: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}