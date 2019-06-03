package Exercises.B_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<String> implements Iterable<String> {
    private List<String> list;
    private Integer index;

    public ListyIterator(String... list) {
        this.setList(Arrays.asList(list));
        this.index = 0;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public boolean move() {
        if (this.list.size() - 1 == this.index) {
            return false;
        }

        this.index++;
        return true;
    }

    public boolean hasNext() {
        return this.list.size() - 1 != this.index;
    }

    public void print() {
        if (this.list.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        System.out.println(this.list.get(this.index));
    }

    public void printAll() {
        if (this.list.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        StringBuilder sb = new StringBuilder();

        for (String string : this.list) {
            sb.append(string).append(" ");
        }

        System.out.println(sb.toString());
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    private final class MyIterator implements Iterator<String> {
        private Integer index;

        public MyIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < list.size();
        }

        @Override
        public String next() {
            return list.get(this.index);
        }
    }
}
