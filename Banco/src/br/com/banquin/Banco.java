package br.com.banquin;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idadeCliente = scanner.nextInt();

            // Criar um objeto Cliente
            Cliente cliente = new Cliente(nomeCliente, idadeCliente);

            System.out.print("Digite o limite da conta: ");
            double limiteConta = scanner.nextDouble();

            // Criar um objeto ContaBancaria
            ContaBancaria conta = new ContaBancaria(nomeCliente, limiteConta);

            while (true) {
                System.out.println("\nEscolha uma operação:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Verificar saldo");
                System.out.println("4. Sair");
                System.out.print("Opção: ");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.print("Digite o valor a sacar: ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                    case 3:
                        System.out.println("Saldo atual: R$" + conta.getSaldo());
                        break;
                    case 4:
                        System.out.println("Obrigado por usar nosso sistema bancário!");
                        return; // Encerrar o programa
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
