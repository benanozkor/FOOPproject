package books;
import betPack.BETcafe;

abstract class Book extends BETcafe {

    private String title;
    private String author;
    private int numberOfPages;
    private double price;
    private String ISBN;

    public Book(String title,String author, int numberOfPages, double price, String ISBN){
        this.title =title;
        this.author =author;
        this.numberOfPages = numberOfPages;
        this.price= price;
        this.ISBN=ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public abstract String genreDescription();

    public double applyDiscount(double discountPer){
        return (price - (price*discountPer /100));
        //*******how can i overload this?????//
    }
}
