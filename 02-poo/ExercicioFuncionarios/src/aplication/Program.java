package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.FuncionarioFisico;
import model.entities.FuncionarioRemoto;
import model.enums.Cargos;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite o número de funcionários: ");
            int n = sc.nextInt();
            List<Funcionario> listaFuncionarios = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("\nDados do funcionário #" + (i + 1));

                System.out.print("É funcionário físico ou remoto (f/r)? ");
                char escolha = sc.next().toLowerCase().charAt(0);

                System.out.print("Primeiro nome: ");
                String nome = sc.next();

                System.out.print("Cargo (Junior/Pleno/Senior): ");
                String cargoStr = sc.next().toUpperCase();
                Cargos cargoReal;
                try {
                    cargoReal = Cargos.valueOf(cargoStr);
                } catch (IllegalArgumentException e) {
                    System.out.println("Cargo inválido! Use apenas: Junior, Pleno ou Senior.");
                    i--;
                    continue;
                }

                System.out.print("Número (0000): ");
                int numero = sc.nextInt();

                System.out.print("Salário: ");
                double salario = sc.nextDouble();

                if (escolha == 'f') {
                    listaFuncionarios.add(new FuncionarioFisico(nome, cargoReal, numero, salario));
                } else if (escolha == 'r') {
                    listaFuncionarios.add(new FuncionarioRemoto(nome, cargoReal, numero, salario));
                } else {
                    System.out.println("Opção inválida! Use apenas 'f' ou 'r'.");
                    i--;
                }
            }
            
            System.out.println();
            System.out.println("-FUNCIONÁRIOS-");
            for (Funcionario func : listaFuncionarios) {
                System.out.print(func);
                if (func instanceof FuncionarioFisico) {
                    System.out.println(" (Funcionário Físico)");
                } else if (func instanceof FuncionarioRemoto) {
                    System.out.println(" (Funcionário HomeOffice)");
                } else {
                    System.out.println(" (Aleatório)");
                }
            }


        } 
        catch (Exception e) {
            System.out.println("Houve um ERRO: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
