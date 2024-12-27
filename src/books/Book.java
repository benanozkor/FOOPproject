package books;
import betCafepackage.BetCafe;
public abstract class Book extends BetCafe {


    private String title;
    private String author;
    private String bookDescription;
    private double price;
    private int quantity;

    public Book(){

    }

    public Book(String title, String author, String bookDescription, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.bookDescription = bookDescription;
        this.price = price;
        this.quantity = quantity;

    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String genreDescription();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


