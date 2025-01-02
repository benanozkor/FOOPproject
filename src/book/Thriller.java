package book;

import java.util.HashMap;

public class Thriller extends Book {

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
        return "Thriller is a genre of fiction with numerous, often overlapping, subgenres, including crime, horror, and detective fiction. Thrillers are characterized and defined by the moods they elicit, giving their audiences heightened feelings of suspense, excitement, surprise, anticipation and anxiety.";
    }


    public Thriller(String title, String author, String bookDescription, double price, int quantity) {
        super(title, author, bookDescription, price, quantity);
    }
}