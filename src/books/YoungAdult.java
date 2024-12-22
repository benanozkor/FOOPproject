package books;

import java.util.*;

public class YoungAdult extends Book {
    @Override
    public String genreDescription(){
        return "Young adult literature is typically written for readers aged 12 to 18 and includes most of the themes found in adult fiction, such as friendship, substance abuse, alcoholism, and sexuality. It is characterized by simpler world building than adult literature as it seeks to highlight the experiences of adolescents in a variety of ways.";
    }

    private HashMap<String,YoungAdult> yaBooks;

    public YoungAdult(String author, String bookDescription, String price){
        super(author, bookDescription, price);
        yaBooks= new HashMap<>();
        mapYA();
    }
    public void mapYA(){
      yaBooks.put("The Inheritance Games", new YoungAdult("Jennifer Lynn Barnes", "A thrilling mystery about a young woman who unexpectedly inherits a fortune, but must solve a series of puzzles to claim it, uncovering dangerous family secrets along the way.", "This book costs 300.4 liras."));
        yaBooks.put("The Hawthorne Legacy", new YoungAdult("Jennifer Lynn Barnes", "The second book in The Inheritance Games series, continuing the twists and turns as Avery Graham navigates a complex web of family secrets and high-stakes games.", "This book costs 312.5 liras."));
        yaBooks.put("The Final Gambit", new YoungAdult("Jennifer Lynn Barnes", "The third book in The Inheritance Games series, where Avery faces her most dangerous challenge yet, as the puzzles become deadlier and the stakes higher.", "This book costs 321.9 liras."));
        yaBooks.put("The Brothers Hawthorne", new YoungAdult("Jennifer Lynn Barnes", "A spin-off series set in the Inheritance Games world, focusing on the Hawthorne brothers and their intertwined fate with Avery.", "This book costs 358.5 liras."));
        yaBooks.put("Lightlark", new YoungAdult("Alex Aster", "A fantasy novel about a cursed island where six rulers must compete in a deadly game to break their respective curses, each vying for ultimate power.", "This book costs 406.2 liras."));
        yaBooks.put("The Hunger Games", new YoungAdult("Suzanne Collins", "A dystopian novel about a brutal competition where children must fight to the death for the entertainment of a totalitarian society, focusing on the survival of Katniss Everdeen.", "This book costs 374.66 liras."));
        yaBooks.put("Aristotle and Dante Discover the Secrets of the Universe", new YoungAdult("Benjamin Alire Sáenz", "A heartwarming coming-of-age story about two Mexican-American boys who develop a deep friendship that slowly evolves into something more.", "This book costs 493.6 liras."));
        yaBooks.put("Truly Devious", new YoungAdult("Maureen Johnson", "A gripping mystery about a teen who tries to solve the historical case of a wealthy family’s disappearance while attending a prestigious school for gifted students.", "This book costs 438.1 liras."));
        yaBooks.put("Games Untold", new YoungAdult("R. A. Spratt", "A young adult mystery involving a group of teens who unravel a series of clues and riddles to uncover a dangerous conspiracy.", "This book costs 402.67 liras."));
        yaBooks.put("The Reappearance of Rachel Price", new YoungAdult("Louise Candlish", "A psychological thriller about a woman’s return to her hometown after a long absence, only to uncover dark secrets about her past.", "This book costs 398.93 liras."));

    }
    public HashMap<String,YoungAdult>getInfoYA(){
        return yaBooks;
    }
}

