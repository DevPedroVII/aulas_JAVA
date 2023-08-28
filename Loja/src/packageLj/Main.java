package packageLj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Productexp(1, "Product A", 19.99, 10));
        store.addProduct(new Productexp(2, "Product B", 29.99, 5));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = new User(username, password);

        ShoppingCart cart = new ShoppingCart();
        StoreUI storeUI = new StoreUI(store, cart, scanner);

        storeUI.run();
    }
}
