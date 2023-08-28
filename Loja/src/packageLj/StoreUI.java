package packageLj;

import java.util.List;
import java.util.Scanner;
/*
 * 
 * Codigo em ingles 
public class StoreUI {
    private Store store;
    private ShoppingCart cart;
    private Scanner scanner;

    public StoreUI(Store store, ShoppingCart cart, Scanner scanner) {
        this.store = store;
        this.cart = cart;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("1. List Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    listProducts();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private void listProducts() {
        List<Productexp> products = store.getAllProducts();
        for (Productexp product : products) {
            System.out.println(product);
        }
    }

    private void addToCart() {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        Productexp selectedProduct = store.getProductById(productId);
        if (selectedProduct != null && selectedProduct.getStock() > 0) {
            cart.addItem(selectedProduct);
            selectedProduct.reduceStock(1);
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Invalid product ID or out of stock.");
        }
    }

    private void viewCart() {
        List<Productexp> items = cart.getItems();
        System.out.println("Items in cart:");
        for (Productexp item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + cart.calculateTotal());
    }

    private void checkout() {
        System.out.println("Total: $" + cart.calculateTotal());
        System.out.println("Thank you for shopping!");
        scanner.close();
        System.exit(0);
    }
}

*/
