package atividades;

import java.util.Scanner;

public class CalcularDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo do Cliente: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o primeiro valor inteiro: ");
        int primeiroValor = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int segundoValor = scanner.nextInt();

        double resultado = (double) primeiroValor / segundoValor;

        System.out.println("Nome Completo do Cliente: " + nomeCompleto);
        System.out.println("Primeiro Valor: " + primeiroValor);
        System.out.println("Segundo Valor: " + segundoValor);
        System.out.println("Resultado da Divisão: " + resultado);

        scanner.close();
    }
}

