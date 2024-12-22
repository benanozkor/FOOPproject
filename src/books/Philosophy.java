package books;
import java.util.*;

public class Philosophy extends Book{
    @Override
    public String genreDescription(){
        return "Philosophy genre are about the fundamental nature of knowledge, reality, and existence as an academic discipline. The books in this genre also explore fundamental truths about one's self, the world, and their relationships.";
    }
private HashMap<String,Philosophy>philosophyBooks;

    public Philosophy(String author, String bookDescription, String price){
        super(author, bookDescription, price);
        philosophyBooks= new HashMap<>();
        mapPhilosophy();
    }

    public void mapPhilosophy(){
        philosophyBooks.put("Beyond Good and Evil: Prelude to a Philosophy of the Future", new Philosophy("Friedrich Nietzsche", "A philosophical exploration of morality, free will, and the nature of truth, challenging traditional values and ethics.", "This book costs 447.72 liras"));
        philosophyBooks.put("Nicomachean Ethics", new Philosophy("Aristotle", "A foundational text in ethics, examining the nature of virtue, happiness, and the pursuit of the good life.", "This book costs 391.72 liras"));
        philosophyBooks.put("Republic", new Philosophy("Plato", "A philosophical dialogue about justice, the ideal state, and the nature of knowledge, featuring Socratic discussions on politics and ethics.", "This book costs 335.72 liras"));
        philosophyBooks.put("Thus Spoke Zarathustra", new Philosophy("Friedrich Nietzsche", "A philosophical work that presents Nietzsche’s ideas on the Übermensch (Superman) and the reevaluation of values, symbolized through the character Zarathustra.", "This book costs 559.72 liras"));
        philosophyBooks.put("The Stranger", new Philosophy("Albert Camus", "A novel that explores existentialism and the absurd, focusing on a man’s indifferent reaction to life and his eventual confrontation with death.", "This book costs 223.72 liras"));
        philosophyBooks.put("The Boy, the Mole, the Fox and the Horse", new Philosophy("Charlie Mackesy", "A beautifully illustrated story of friendship, love, and kindness, filled with life lessons and simple wisdom.", "This book costs 335.72 liras"));
        philosophyBooks.put("Apology", new Philosophy("Plato", "A short dialogue in which Socrates defends his philosophy and way of life against the charges brought against him by the Athenian authorities.", "This book costs 223.72 liras"));
        philosophyBooks.put("The Symposium", new Philosophy("Plato", "A philosophical dialogue about love, exploring its nature through a series of speeches at a dinner party.", "This book costs 335.72 liras"));
        philosophyBooks.put("Nausea", new Philosophy("Jean-Paul Sartre", "A novel that explores existential themes of alienation, absurdity, and the meaning of life through the experiences of a man in crisis.", "This book costs 447.72 liras"));
        philosophyBooks.put("The Art of War", new Philosophy("Sun Tzu", "An ancient Chinese military treatise that offers strategies and wisdom applicable to warfare, leadership, and conflict resolution.", "This book costs 391.72 liras"));

    }
    public HashMap<String,Philosophy>getInfoPhilosophy(){
        return philosophyBooks;
    }
}
