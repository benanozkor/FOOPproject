package books;

import java.util.HashMap;

public class Mangas extends Book {

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
        return "Manga is an umbrella term for a wide variety of comic books and graphic novels originally produced and published in Japan. Unlike American comic books, which are usually printed in full color, Japanese manga are almost always published in black and white.";
    }

    public Mangas(String title, String author, String bookDescription, double price, int quantity) {
        super(title, author, bookDescription, price, quantity);
    }

}

