package atividades;

import java.util.Scanner;

public class ProgramaEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        System.out.println("Quantos estudantes deseja cadastrar? ");
        int numeroEstudantes = scanner.nextInt();

        scanner.nextLine();

        String[] nomesEstudantes = new String[numeroEstudantes];
        double[] notas1 = new double[numeroEstudantes];
        double[] notas2 = new double[numeroEstudantes];
        double[] medias = new double[numeroEstudantes];

        for (int i = 0; i < numeroEstudantes; i++) {
            System.out.println("Digite o nome do estudante " + (i + 1) + ": ");
            nomesEstudantes[i] = scanner.nextLine();

            System.out.println("Digite a primeira nota do estudante " + (i + 1) + ": ");
            notas1[i] = scanner.nextDouble();

            System.out.println("Digite a segunda nota do estudante " + (i + 1) + ": ");
            notas2[i] = scanner.nextDouble();

            medias[i] = (notas1[i] + notas2[i]) / 2;

            scanner.nextLine();
        }

        System.out.println("Dados dos estudantes:");
        for (int i = 0; i < numeroEstudantes; i++) {
            System.out.println("NOME: " + nomesEstudantes[i]);
            System.out.println("NOTA 1: " + notas1[i]);
            System.out.println("NOTA 2: " + notas2[i]);
            System.out.println("MÉDIA: " + medias[i]);
            System.out.println();
        }

        System.out.println("Nome do professor: " + nomeProfessor);

        scanner.close();
    }
}
