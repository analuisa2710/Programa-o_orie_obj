package application;

import java.util.Scanner;

import entities.Pessoas;

public class Programa_Analuísadapenhamatos {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Pessoas[] cadastros = new Pessoas[10];
	        int contadorCadastros = 0;

	        int opcao;
	        do {
	            System.out.println("MENU");
	            System.out.println("1 – Cadastro Graduação");
	            System.out.println("2 – Cadastro PosGraduação");
	            System.out.println("3 – Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    if (contadorCadastros < 10) {
	                        cadastros[contadorCadastros] = cadastrarGraduacao(scanner);
	                        contadorCadastros++;
	                    } else {
	                        System.out.println("Limite de cadastros atingido.");
	                    }
	                    break;
	                case 2:
	                    if (contadorCadastros < 10) {
	                        cadastros[contadorCadastros] = cadastrarPosGraduacao(scanner);
	                        contadorCadastros++;
	                    } else {
	                        System.out.println("Limite de cadastros atingido.");
	                    }
	                    break;
	                case 3:
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != 3);

	        System.out.println("\nTodos os cadastros:\n");

	        for (int i = 0; i < contadorCadastros; i++) {
	            System.out.println(cadastros[i]);
	        }
	    }

	    private static Graduacao_Analuísadapenhamatos cadastrarGraduacao(Scanner scanner) {
	        Graduacao_Analuísadapenhamatos graduacao = new Graduacao_Analuísadapenhamatos();
	        cadastrarPessoa(scanner, graduacao);
	        System.out.print("Informe o curso de graduação: ");
	        graduacao.setCursoGraduacao(scanner.nextLine());
	        return graduacao;
	    }

	    private static PosGraduacao_Analuísadapenhamatos cadastrarPosGraduacao(Scanner scanner) {
	        PosGraduacao_Analuísadapenhamatos posGraduacao = new PosGraduacao_Analuísadapenhamatos();
	        cadastrarPessoa(scanner, posGraduacao);
	        System.out.print("Informe o curso de pós-graduação: ");
	        posGraduacao.setCursoPosgraduacao(scanner.nextLine());
	        return posGraduacao;
	    }

	    private static void cadastrarPessoa(Scanner scanner, Pessoas pessoa) {
	        System.out.print("Informe o nome: ");
	        pessoa.setNome(scanner.nextLine());
	        System.out.print("Informe o CPF: ");
	        pessoa.setCpf(scanner.nextLine());
	        System.out.print("Informe a matrícula: ");
	        pessoa.setMatricula(scanner.nextLine());
	    }

}
