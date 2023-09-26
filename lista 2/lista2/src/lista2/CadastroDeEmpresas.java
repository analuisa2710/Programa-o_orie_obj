package lista2;
import java.util.Scanner;
public class CadastroDeEmpresas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeEmpresa;
        String cnpj;
        double rendaBrutaMensal;
        
        System.out.println("Sistema de cadastro de empresas!");
        System.out.println("Para sair, digite 0 como CNPJ.");

        while (true) {
            System.out.print("Digite o nome da empresa: ");
            nomeEmpresa = input.nextLine();

            if (nomeEmpresa.equals("0")) {
                break;
            }

            System.out.print("Digite o CNPJ da empresa (ou 0 para sair): ");
            cnpj = input.nextLine();

            if (cnpj.equals("0")) {
                break;
            }

            System.out.print("Digite a renda bruta mensal da empresa: ");
            rendaBrutaMensal = input.nextDouble();
            input.nextLine(); 
            System.out.println("Empresa cadastrada!");
            System.out.println("--------------------------------");
        }

        System.out.println("Obrigado por usar o sistema de cadastro de empresas!");
        input.close();
    }
}
