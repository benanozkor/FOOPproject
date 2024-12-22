package books;
import betPack.BETcafe;
import java.util.*;


 public abstract class Book extends BETcafe {

    //private String title;
    private String author;
    private String bookDescription;
    private String price;


    public Book(String author, String bookDescription, String price){
        this.author=author;
        this.bookDescription=bookDescription;
        this.price=price;

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

     public String getPrice() {
         return price;
     }

     public void setPrice(String price) {
         this.price = price;
     }

     public abstract String genreDescription();


}
