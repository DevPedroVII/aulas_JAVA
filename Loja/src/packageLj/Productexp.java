package packageLj;

public class Productexp {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Productexp(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        stock -= quantity;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - $" + price;
    }
}
