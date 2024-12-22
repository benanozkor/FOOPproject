package books;
import java.util.*;

public class Thriller extends Book{
    @Override
    public String genreDescription(){
        return "Thriller is a genre of fiction with numerous, often overlapping, subgenres, including crime, horror, and detective fiction. Thrillers are characterized and defined by the moods they elicit, giving their audiences heightened feelings of suspense, excitement, surprise, anticipation and anxiety.";
    }

    private HashMap<String,Thriller>thrillerBooks;

    public Thriller(String author, String bookDescription, String price){
        super(author, bookDescription, price);
        thrillerBooks= new HashMap<>();
        mapThriller();
    }
    public void mapThriller(){
        thrillerBooks.put("The Housemaid", new Thriller("Frieda McFadden", "A psychological thriller about a woman who becomes a housemaid for a wealthy family, only to uncover dark secrets and her own hidden motives.", "This book costs 300.4 liras"));
        thrillerBooks.put("Five Survive", new Thriller("Holly Jackson", "A suspenseful thriller about five friends trapped in an RV, where secrets unravel and survival becomes a life-or-death struggle.", "This book costs 312.5 liras"));
        thrillerBooks.put("The Naturals", new Thriller("Jennifer Lynn Barnes", "A series following a group of gifted teens with exceptional skills in profiling and detection as they solve complex criminal cases, facing danger and personal challenges along the way.", "This book costs 321.9 liras"));
        thrillerBooks.put("Killer Instinct", new Thriller("Jennifer Lynn Barnes", "The second book in The Naturals series, continuing the teens’ thrilling investigations and diving deeper into the mysteries of their past.", "This book costs 358.5 liras"));
        thrillerBooks.put("All In", new Thriller("Jennifer Lynn Barnes", "The third book in The Naturals series, where the team faces new dangers and challenges, testing their skills and relationships to the limit.", "This book costs 406.2 liras"));
        thrillerBooks.put("Bad Blood", new Thriller("Jennifer Lynn Barnes", "The fourth book in The Naturals series, where the characters uncover deadly secrets and confront the darkest forces they’ve ever encountered.", "This book costs 374.66 liras"));
        thrillerBooks.put("We Were Liars", new Thriller("E. Lockhart", "A captivating, twist-filled mystery about a privileged family whose dark secrets are revealed during a summer spent on their private island.", "This book costs 493.6 liras"));
        thrillerBooks.put("Jackal", new Thriller("Erin E. Adams", "A chilling thriller that follows a group of friends who return to their hometown, only to confront a series of horrific events linked to a long-buried secret.", "This book costs 438.1 liras"));
        thrillerBooks.put("The Shining", new Thriller("Stephen King", "A horror classic that tells the story of a family trapped in an isolated hotel, where supernatural forces prey on their weaknesses and fear.", "This book costs 402.67 liras"));
        thrillerBooks.put("The Outsider", new Thriller("Stephen King", "A gripping mystery that blends crime, horror, and supernatural elements as a detective investigates a brutal murder with eerie implications.", "This book costs 398.93 liras"));

    }
    public HashMap<String,Thriller>getInfoThriller(){
        return thrillerBooks;
    }
}
