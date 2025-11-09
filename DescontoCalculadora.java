package atividades.poo;

import java.util.Scanner;

public class DescontoCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print("Informe a porcentagem de desconto (%): ");
        double percentual = sc.nextDouble();

        double valorDesconto = valorProduto * (percentual / 100.0);
        double precoFinal = valorProduto - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final: R$ %.2f%n", precoFinal);

        sc.close();
    }
}