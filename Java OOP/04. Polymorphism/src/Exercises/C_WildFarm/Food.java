package Exercises.C_WildFarm;

public abstract class Food {
    private Integer quantity;

    protected Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    protected Integer getQuantity() {
        return quantity;
    }

    protected void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
