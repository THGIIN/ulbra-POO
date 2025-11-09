package atividades.poo;

import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String esperado = "java8";

        boolean sucesso = false;
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("Login: ");
            String login = sc.next();
            System.out.print("Senha: ");
            String senha = sc.next();

            if (esperado.equals(login) && esperado.equals(senha)) {
                sucesso = true;
                break;
            } else {
                int restantes = 3 - tentativa;
                System.out.println("Login ou senha incorretos. Tentativas restantes: " + restantes);
            }
        }

        if (sucesso) {
            System.out.println("Acesso concedido. Bem-vindo!");
        } else {
            System.out.println("Acesso bloqueado. Tente novamente mais tarde.");
        }

        sc.close();
    }
}