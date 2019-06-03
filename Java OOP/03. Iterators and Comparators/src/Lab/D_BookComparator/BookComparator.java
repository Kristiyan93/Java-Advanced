package Lab.D_BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book a, Book b) {
        if (a.getTitle().compareTo(b.getTitle()) == 0) {
            return a.getYear().compareTo(b.getYear());
        }

        return a.getTitle().compareTo(b.getTitle());
    }
}

