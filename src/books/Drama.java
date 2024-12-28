package books;


import java.util.HashMap;
import java.util.Map;

public class Drama extends Book {

    @Override
    public void welcome() {
        System.out.println("Welcome to Bet Cafe");
    }


    @Override
    public String toString(){
        return super.getTitle() + " by " + super.getAuthor() + super.getPrice() + " TL. ";
    }
    @Override
    public String genreDescription() {
        return "The drama genre is strongly based in a character, or characters, that are in conflict at a crucial moment in their lives. Most dramas revolve around families and often have tragic or painful resolutions.";
    }


    public Drama(String title, String author, String bookDescription, double price, int quantity) {
        super(title, author, bookDescription, price, quantity);
    }
}
