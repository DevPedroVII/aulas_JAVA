package packard;

import java.time.LocalDateTime;

public class Transaction {
    private String cardNumber;
    private double amount;
    private LocalDateTime timestamp;
    
    public Transaction(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    @Override
    public String toString() {
        return "Transação [Cartão: " + cardNumber + ", Valor: $" + amount + ", Data: " + timestamp + "]";
    }
}
