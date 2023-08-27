package packard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CreditCard> creditCards = new ArrayList<>();
        
        while (true) {
            System.out.println("1. Criar novo cartão de crédito");
            System.out.println("2. Fazer depósito");
            System.out.println("3. Realizar compra");
            System.out.println("4. Ver saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (choice) {
                case 1:
                    System.out.print("Digite o número do cartão: ");
                    String cardNumber = scanner.nextLine();
                    creditCards.add(new CreditCard(cardNumber));
                    System.out.println("Cartão de crédito criado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o número do cartão: ");
                    String depositCardNumber = scanner.nextLine();
                    CreditCard depositCard = findCreditCard(creditCards, depositCardNumber);
                    if (depositCard != null) {
                        System.out.print("Digite o valor do depósito: $");
                        double amount = scanner.nextDouble();
                        depositCard.deposit(amount);
                    } else {
                        System.out.println("Cartão não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número do cartão: ");
                    String purchaseCardNumber = scanner.nextLine();
                    CreditCard purchaseCard = findCreditCard(creditCards, purchaseCardNumber);
                    if (purchaseCard != null) {
                        System.out.print("Digite o valor da compra: $");
                        double purchaseAmount = scanner.nextDouble();
                        purchaseCard.charge(purchaseAmount);
                    } else {
                        System.out.println("Cartão não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o número do cartão: ");
                    String balanceCardNumber = scanner.nextLine();
                    CreditCard balanceCard = findCreditCard(creditCards, balanceCardNumber);
                    if (balanceCard != null) {
                        balanceCard.displayBalance();
                    } else {
                        System.out.println("Cartão não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do aplicativo.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    
    private static CreditCard findCreditCard(List<CreditCard> creditCards, String cardNumber) {
        for (CreditCard card : creditCards) {
            if (card.getCardNumber().equals(cardNumber)) {
                return card;
            }
        }
        return null;
    }
}
