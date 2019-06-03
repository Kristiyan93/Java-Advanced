package Exercises.D_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Integer money;
    private List<Product> products;

    public Person(String name, Integer money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public Person(String name, Integer money, List<Product> products) {
        this.setName(name);
        this.setMoney(money);
        this.products = products;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public Integer getMoney() {
        return this.money;
    }

    private void setMoney(Integer money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void boughtProduct(Product product) {
        if (this.getMoney() - product.getCost() >= 0) {
            this.money -= product.getCost();
            this.products.add(product);
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", getName(), product.getNameProduct()));
        }
    }
}
