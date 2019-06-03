package d_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Double money;
    private List<Product> products;

    public Person(String name, Double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public void setName(String name) {
        if (name.trim().length() == 0 || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    public void setMoney(Double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.money = money;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void buyProduct(Product product) {
        if (this.money - product.getCoust() < 0) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }

        this.money -= product.getCoust();

        this.products.add(product);
    }


}
