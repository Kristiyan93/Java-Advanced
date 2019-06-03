package d_ShoppingSpree;

public class Product {
    private String name;
    private Double coust;

    public Product(String name, Double coust) {
        setName(name);
        setCoust(coust);
    }

    public void setName(String name) {
        if (name.trim().length() == 0 || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    public void setCoust(Double coust) {
        if (coust < 0) {
            throw new IllegalArgumentException("Money cannot be a negative number.");
        }

        this.coust = coust;
    }

    public Double getCoust() {
        return coust;
    }

    public String getName() {
        return name;
    }
}
