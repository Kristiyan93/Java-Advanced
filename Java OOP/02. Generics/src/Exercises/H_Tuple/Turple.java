package Exercises.H_Tuple;

public class Turple<T> {
    private T firstItem;
    private T secondItem;

    public Turple(T firstItem, T secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    @Override
    public String toString() {
        return this.firstItem.toString() + " -> " + this.secondItem.toString();
    }
}
