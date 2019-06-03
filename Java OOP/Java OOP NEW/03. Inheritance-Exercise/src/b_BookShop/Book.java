package b_BookShop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        if (Character.isDigit(author.split(" ")[1].charAt(0))) {
            throw new IllegalArgumentException("Author not valid!");
        }

        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }

        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator())
                .append("Title: ").append(this.title).append(System.lineSeparator())
                .append("Author: ").append(this.author).append(System.lineSeparator())
                .append("Price: ").append(String.format("%.1f", this.getPrice())).append(System.lineSeparator());

        return sb.toString();
    }
}
