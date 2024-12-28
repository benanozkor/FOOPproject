package books;

import java.util.HashMap;

public class Classics extends Book {
    @Override
    public void welcome() {
        System.out.println("Welcome to Bet Cafe");
    }

    public Classics() {

    }
    @Override
    public String toString(){
        return super.getTitle() + " by " + super.getAuthor() + super.getPrice() + " TL. ";
    }

    public Classics(String title, String author, String bookDescription, double price, int quantity) {
        super(title,author, bookDescription, price, quantity);

    }

    @Override
    public String genreDescription() {
        return "World classics are to express successful novels that continue to be read and admired even after many years and are among the best examples of the genre.";
    }
}



