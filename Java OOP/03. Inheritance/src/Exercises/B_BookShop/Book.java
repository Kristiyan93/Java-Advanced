package Exercises.B_BookShop;

public class Book {

    private String author;
    private String title;
    private Double price;

    public Book(String author, String title, Double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        String[] tokensAuthor = author.split("\\s+");
        if (tokensAuthor.length > 1) {
            if (Character.isDigit(tokensAuthor[1].charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }

        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }

        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    protected void setPrice(Double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }

        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append("\n")
                .append("Title: ").append(this.getTitle())
                .append("\n")
                .append("Author: ").append(this.getAuthor())
                .append("\n")
                .append("Price: ").append(this.getPrice())
                .append("\n");

        return sb.toString();
    }
}
