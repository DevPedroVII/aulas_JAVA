package packageLj;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Productexp> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Productexp productexp) {
        items.add(productexp);
    }

    public double calculateTotal() {
        double total = 0;
        for (Productexp item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<Productexp> getItems() {
        return items;
    }
}
