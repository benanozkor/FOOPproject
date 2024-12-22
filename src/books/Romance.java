package books;
import java.util.*;
public class Romance extends Book{
    @Override
    public String genreDescription(){
        return " The romance genre in literature focuses on the idea of love and relationships of the characters. While it may absolutely have mystery, adventure, and other elements, it is the romantic plot that runs the strongest through the piece and is the most heavily focused upon.";
    }

    private HashMap<String,Romance>romanceBooks;

    public Romance(String author, String bookDescription, String price){
        super(author, bookDescription, price);
        romanceBooks= new HashMap<>();
        mapRomance();
    }
    public void mapRomance(){
        romanceBooks.put("The Song of Achilles", new Romance("Madeline Miller", "A retelling of the Iliad that explores the intense and emotional relationship between Achilles and Patroclus, set against the backdrop of the Trojan War.", "This book costs 300.4 liras"));
        romanceBooks.put("Call Me by Your Name", new Romance("André Aciman", "A poignant and passionate coming-of-age romance about two young men who fall in love during a summer in Italy.", "This book costs 312.5 liras"));
        romanceBooks.put("Divine Rivals", new Romance("Rebecca Ross", "A magical romance set in a world torn by war, where two rivals must navigate their complex feelings for each other amid divine intervention.", "This book costs 321.9 liras"));
        romanceBooks.put("Better Than the Movies", new Romance("Lynn Painter", "A fun and heartwarming rom-com about a high school girl who navigates love and friendship while dealing with her favorite movie-inspired fantasies.", "This book costs 358.5 liras"));
        romanceBooks.put("The Notebook", new Romance("Nicholas Sparks", "A timeless romance about a couple's enduring love, told through the memories of an elderly man reading their story to his wife.", "This book costs 406.2 liras"));
        romanceBooks.put("Powerless", new Romance("Tera Lynn Childs", "A young adult fantasy where a teenage girl discovers her hidden power in a world where everyone has abilities, leading her to confront dangers and secrets.", "This book costs 374.66 liras"));
        romanceBooks.put("The Bridge Kingdom", new Romance("Danielle L. Jensen", "A captivating fantasy about a princess who must navigate political intrigue and war as she is sent to marry a powerful king to secure her kingdom’s future.", "This book costs 493.6 liras"));
        romanceBooks.put("The Fault in Our Stars", new Romance("John Green", "A heartbreaking love story between two teenagers who bond over their shared experiences with cancer, learning about love, loss, and living in the face of illness.", "This book costs 438.1 liras"));
        romanceBooks.put("Outlander", new Romance("Diana Gabaldon", "A historical fiction saga about a woman who is transported back in time to 18th-century Scotland, where she navigates love, adventure, and political intrigue.", "This book costs 402.67 liras"));
        romanceBooks.put("Sense and Sensibility", new Romance("Jane Austen", "A classic tale of two sisters with contrasting temperaments who navigate love, heartbreak, and family relationships in Regency-era England.", "This book costs 398.93 liras"));
    }
    public HashMap<String,Romance>getInfoRomance(){
        return romanceBooks;
    }
}
