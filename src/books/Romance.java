package books;

import java.util.HashMap;

public class Romance extends Book {

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
        return " The romance genre in literature focuses on the idea of love and relationships of the characters. While it may absolutely have mystery, adventure, and other elements, it is the romantic plot that runs the strongest through the piece and is the most heavily focused upon.";
    }


    public Romance(String title, String author, String bookDescription, double price, int quantity){
        super(title, author, bookDescription, price, quantity);
    }

}
