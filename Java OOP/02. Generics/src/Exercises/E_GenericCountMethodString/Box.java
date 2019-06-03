package Exercises.E_GenericCountMethodString;

import java.util.List;

public class Box<T> {
    private T type;

    public Box(T type) {
        this.type = type;
    }

    private static <T extends Comparable<T>> Integer returnCount(List<T> list, T element) {
        int count = 0;

        for (T listElement : list) {
            if (listElement.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return this.type.getClass().getCanonicalName() + ": " + this.type;
    }
}
