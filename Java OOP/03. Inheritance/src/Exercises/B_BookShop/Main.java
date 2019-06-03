package Exercises.B_BookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Book book = null;
        GoldenEditionBook goldenEditionBook = null;

        String author = reader.readLine();
        String title = reader.readLine();
        Double price = Double.parseDouble(reader.readLine());

        try {
            book = new Book(author, title, price);
            goldenEditionBook = new GoldenEditionBook(author, title, price);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }

        Method[] goldenBookDeclaredMethods =
                GoldenEditionBook.class.getDeclaredMethods();

        if (goldenBookDeclaredMethods.length > 1) {
            throw new IllegalArgumentException(
                    "Code duplication in GoldenEditionBook!");
        }

        System.out.println(book.toString());
        System.out.println(goldenEditionBook.toString());
    }
}
