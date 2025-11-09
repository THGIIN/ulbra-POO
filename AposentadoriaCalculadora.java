package atividades.poo;

import java.util.Scanner;

public class AposentadoriaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe o sexo (M/F): ");
        String sexoStr = sc.next();
        char sexo = sexoStr.trim().isEmpty() ? 'M' : Character.toUpperCase(sexoStr.charAt(0));
        System.out.print("Informe os anos de contribuição: ");
        int anosContrib = sc.nextInt();

        int idadeMinima = (sexo == 'M') ? 65 : 62;
        int tempoMinimo = (sexo == 'M') ? 35 : 30;

        boolean porIdade = idade >= idadeMinima;
        boolean porTempo = anosContrib >= tempoMinimo;

        if (porIdade || porTempo) {
            System.out.println("Pode se aposentar: " + (porIdade ? "por idade" : "por tempo de contribuição"));
        } else {
            int faltaIdade = Math.max(0, idadeMinima - idade);
            int faltaTempo = Math.max(0, tempoMinimo - anosContrib);
            System.out.println("Ainda não pode se aposentar.");
            System.out.println("Faltam " + faltaIdade + " ano(s) por idade.");
            System.out.println("Faltam " + faltaTempo + " ano(s) por tempo de contribuição.");
        }

        sc.close();
    }
}