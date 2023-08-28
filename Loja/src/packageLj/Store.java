package packageLj;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Productexp> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Productexp product) {
        products.add(product);
    }

    public Productexp getProductById(int id) {
        for (Productexp productexp : products) {
            if (productexp.getId() == id) {
                return productexp;
            }
        }
        return null;
    }

    public List<Productexp> getAllProducts() {
        return products;
    }
}
