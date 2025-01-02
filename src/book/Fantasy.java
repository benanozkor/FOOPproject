package book;

import java.util.HashMap;

public class Fantasy extends Book {

    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }

    @Override
    public String toString(){
        return super.getTitle() + " by " + super.getAuthor() + super.getPrice() + " TL. ";
    }
    @Override
    public String genreDescription(){
        return "Fantasy fiction is a genre of fiction that involves elements that cannot exist within the real world. This fictional universe includes things like magic, mythology, or life from other worlds or universes.";
    }


    public Fantasy(String title, String author, String bookDescription, double price, int quantity) {
        super(title, author, bookDescription, price, quantity);
    }

}