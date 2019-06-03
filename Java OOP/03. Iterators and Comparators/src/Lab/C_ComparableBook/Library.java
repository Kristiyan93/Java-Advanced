package Lab.C_ComparableBook;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new Libiterator();
    }

    private final class Libiterator implements Iterator<Book> {
        private int counter;

        public Libiterator() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            return books[this.counter++];
        }
    }
}
