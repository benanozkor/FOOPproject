package books;

import java.util.HashMap;

public class Fantasy extends Book {
    @Override
    public String genreDescription(){
        return "Fantasy fiction is a genre of fiction that involves elements that cannot exist within the real world. This fictional universe includes things like magic, mythology, or life from other worlds or universes.";
    }

    private HashMap<String, Fantasy> fantasyBooks;

    public Fantasy(String author, String bookDescription, String price) {
        super(author, bookDescription, price);
        fantasyBooks = new HashMap<>();
        mapFantasy();
    }
public void mapFantasy(){
    fantasyBooks.put("The Cruel Prince", new Fantasy("Holly Black", "A captivating tale of political intrigue and treachery in the world of Faerie, where a mortal girl vies for power.", "This book costs 300.4 liras"));
    fantasyBooks.put("The Wicked King", new Fantasy("Holly Black", "A gripping sequel delving into courtly deception and dangerous alliances in the Faerie realm.", "This book costs 312.5 liras"));
    fantasyBooks.put("The Queen of Nothing", new Fantasy("Holly Black", "The thrilling conclusion to the series, where loyalty, love, and power collide in the Faerie world.", "This book costs 321.9 liras"));
    fantasyBooks.put("Six of Crows", new Fantasy("Leigh Bardugo", "A thrilling heist fantasy featuring a band of misfits attempting an impossible mission in a magical world.", "This book costs 358.5 liras"));
    fantasyBooks.put("Crooked Kingdom", new Fantasy("Leigh Bardugo", "The high-stakes sequel, packed with danger, cunning plans, and unforgettable characters.", "This book costs 406.2 liras"));
    fantasyBooks.put("The Poppy War", new Fantasy("R.F. Kuang", "A dark and compelling epic inspired by Chinese history, exploring war, power, and the cost of ambition.", "This book costs 374.66 liras"));
    fantasyBooks.put("The Dragon Republic", new Fantasy("R.F. Kuang", "The intense sequel, delving deeper into rebellion, loyalty, and the aftermath of devastating war.", "This book costs 493.6 liras"));
    fantasyBooks.put("The Burning God", new Fantasy("R.F. Kuang", "The explosive finale, exploring the consequences of revenge, betrayal, and unyielding power.", "This book costs 438.1 liras"));
    fantasyBooks.put("Once Upon a Broken Heart", new Fantasy("Stephanie Garber", "A whimsical and romantic fantasy about curses, bargains, and the magic of broken hearts.", "This book costs 402.67 liras"));
    fantasyBooks.put("The Ballad of Never After", new Fantasy("Stephanie Garber", "A dazzling sequel exploring love, heartbreak, and the choices that shape destinies.", "This book costs 398.93 liras"));
    fantasyBooks.put("A Curse for True Love", new Fantasy("Stephanie Garber", "The enchanting conclusion to the trilogy, weaving together romance, magic, and a quest for true love.", "This book costs 347.52 liras"));

}

    public HashMap<String, Fantasy> getInfoFantasy(){
        return fantasyBooks;
    }
}
