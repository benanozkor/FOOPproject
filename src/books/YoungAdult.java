package books;

import java.util.HashMap;

public class YoungAdult extends Book {

    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }

    @Override
    public String genreDescription(){
        return "Young adult literature is typically written for readers aged 12 to 18 and includes most of the themes found in adult fiction, such as friendship, substance abuse, alcoholism, and sexuality. It is characterized by simpler world building than adult literature as it seeks to highlight the experiences of adolescents in a variety of ways.";
    }


    public YoungAdult(String title, String author, String bookDescription, double price, int quantity){
        super(title, author, bookDescription, price, quantity);
    }

}

