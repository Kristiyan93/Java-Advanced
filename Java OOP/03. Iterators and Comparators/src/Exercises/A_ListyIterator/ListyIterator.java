package Exercises.A_ListyIterator;

import java.util.Arrays;
import java.util.List;

public class ListyIterator {
    private List<String> list;
    private Integer index;

    public ListyIterator(String... list) {
        this.setList(Arrays.asList(list));
        this.index = 0;
    }

    private void setList(List<String> list) {
        this.list = list;
    }

    public boolean move() {
        if (list.size() - 1 == index) {
            return false;
        }

        this.index++;
        return true;
    }

    public boolean hasNext() {
        if (list.size() -  1 <= index) {
            return false;
        }

        return true;
    }

    public void print() {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        System.out.println(list.get(index));
    }
}
