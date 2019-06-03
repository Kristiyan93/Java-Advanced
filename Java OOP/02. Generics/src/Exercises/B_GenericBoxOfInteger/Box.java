package Exercises.B_GenericBoxOfInteger;

public class Box<T> {
    private T type;

    public Box(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type.getClass().getCanonicalName() + ": " + this.type;
    }
}
