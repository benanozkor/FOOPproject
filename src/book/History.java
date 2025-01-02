package book;

import java.util.HashMap;

public class History extends Book {

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
        return "History genre consists of events of significant change that happened in the past and the discovery, collection, presentation, and organization of the information";
    }

    private HashMap<String, History> historyBooks;

    public History(String title,String author, String bookDescription, double price, int quantity){
        super(title,author, bookDescription, price, quantity);
    }

}