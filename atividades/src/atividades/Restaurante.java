package atividades;

import java.util.Scanner;

public class Restaurante {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        double valorTotal = 0;

		        String[] produtos = new String[3];
		        double[] valores = new double[3];
		        int[] quantidades = new int[3];

		        System.out.println("Bem-vindo ao sistema de pedidos da Empresa Restaurante!");

		        for (int i = 0; i < 3; i++) {
		            System.out.println("\nPedido " + (i + 1));

		            int numeroMesa; 

		            System.out.print("Digite o número da mesa: ");
		            numeroMesa = scanner.nextInt();
		            scanner.nextLine(); 

		            System.out.print("Digite o nome da bebida ou refeição: ");
		            produtos[i] = scanner.nextLine();
		            
		            System.out.print("Digite o valor da bebida ou refeição: ");
		            valores[i] = scanner.nextDouble();

		            System.out.print("Digite a quantidade de bebidas ou refeições: ");
		            quantidades[i] = scanner.nextInt();

		            valorTotal += valores[i] * quantidades[i];
		        }


		        System.out.println("\nResumo dos Pedidos:");

		        for (int i = 0; i < 3; i++) {
		            System.out.println("Pedido " + (i + 1) + ":");

		            System.out.println("Produto: " + produtos[i]);
		            System.out.println("Valor: R$" + valores[i]);
		            System.out.println("Quantidade: " + quantidades[i]);
		            System.out.println();
		        }

		        System.out.println("Valor Total: R$" + valorTotal);

		        scanner.close();
		    }
		}

