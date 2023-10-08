package br.com.fiap.aula;

import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Lê os dois números
            System.out.print("Digite o primeiro número: ");
            int numero1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = sc.nextInt();

            // Verifica se o segundo número é zero
            if (numero2 != 0) {
                // Realiza a divisão
                int divisao = numero1 / numero2;
                // Exibe o resultado
                System.out.println("O resultado é: " + divisao);
            } else {
                System.err.println("Erro ao dividir por zero!");
            }
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir por zero!");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Entrada inválida. Por favor, insira um número inteiro.");
        } finally {
            sc.close();
        }
    }
}
