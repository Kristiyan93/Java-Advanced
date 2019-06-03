package Exercises.D_ShoppingSpree;

public class Product {

    private String nameProduct;
    private Integer cost;

    public Product(String nameProduct, Integer cost) {
        this.setNameProduct(nameProduct);
        this.setCost(cost);
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    private void setNameProduct(String nameProduct) {
        if (nameProduct == null || nameProduct.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.nameProduct = nameProduct;
    }

    public Integer getCost() {
        return this.cost;
    }

    private void setCost(Integer cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
