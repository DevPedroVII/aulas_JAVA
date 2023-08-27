package packard;

public class CreditCard {
    private String cardNumber;
    private double balance;
    
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.balance = 0.0;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de $" + amount + " realizado com sucesso.");
    }
    
    public boolean charge(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Compra de $" + amount + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para a compra de $" + amount + ".");
            return false;
        }
    }
    
    public void displayBalance() {
        System.out.println("Saldo disponível no cartão: $" + balance);
    }
}
