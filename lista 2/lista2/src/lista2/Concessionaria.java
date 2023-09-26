package lista2;
import java.util.Scanner;
public class Concessionaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha;
        
        System.out.println("Bem-vindo à concessionária!");
        
        do {
            System.out.print("Digite a senha: ");
            senha = input.nextLine();
            
            if (!senha.equals("123")) {
                System.out.println("SENHA INCORRETA");
            }
        } while (!senha.equals("123"));
        
        System.out.println("SENHA CORRETA");
        
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastro de Cliente");
            System.out.println("2. Compra de Carro");
            System.out.println("3. Compra de Acessório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = input.nextInt();
            input.nextLine(); 
            
            switch (opcao) {
                case 1:
                    cadastrarCliente(input);
                    break;
                case 2:
                    comprarCarro(input);
                    break;
                case 3:
                    comprarAcessorio(input);
                    break;
                case 0:
                    System.out.println("Obrigado por usar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        
        input.close();
    }
    
    public static void cadastrarCliente(Scanner input) {
        System.out.println("\nCadastro de Cliente:");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = input.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = input.nextLine();
        
        
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    public static void comprarCarro(Scanner input) {
        System.out.println("\nCompra de Carro:");
        System.out.println("Opções de carros:");
        System.out.println("1. Carro A");
        System.out.println("2. Carro B");
        System.out.println("3. Carro C");
        System.out.print("Escolha um carro (1/2/3): ");
        int escolhaCarro = input.nextInt();
        input.nextLine(); 
        
        System.out.print("Digite a cor do carro: ");
        String corCarro = input.nextLine();
        System.out.print("Escolha a forma de pagamento: ");
        String formaPagamento = input.nextLine();
        
        
        System.out.println("Compra de carro concluída!");
    }
    
    public static void comprarAcessorio(Scanner input) {
        System.out.println("\nCompra de Acessório:");
        System.out.print("Digite o nome do acessório: ");
        String nomeAcessorio = input.nextLine();
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = input.nextInt();
        input.nextLine(); 
        
        System.out.println("Compra de acessório concluída!");
    }
}
