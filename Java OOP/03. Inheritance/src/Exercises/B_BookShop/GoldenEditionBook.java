package Exercises.B_BookShop;

public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String author, String title, Double price) {
        super(author, title, price);
    }

    @Override
    protected void setPrice(Double price) {
        Double higherPrice = price * 0.3;
        price += higherPrice;
        super.setPrice(price);
    }
}
