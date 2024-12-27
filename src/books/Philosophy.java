package books;

import java.util.HashMap;

public class Philosophy extends Book {

    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }

    @Override
    public String genreDescription(){
        return "Philosophy genre are about the fundamental nature of knowledge, reality, and existence as an academic discipline. The books in this genre also explore fundamental truths about one's self, the world, and their relationships.";
    }

    public Philosophy(String title, String author, String bookDescription, double price, int quantity){
        super(title, author, bookDescription, price, quantity);
    }
}
