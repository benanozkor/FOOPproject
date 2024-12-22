package books;
import java.util.*;
import books.Book;

public class Classics extends Book {


    @Override
    public String genreDescription() {
        return "World classics are to express successful novels that continue to be read and admired even after many years and are among the best examples of the genre.";
    }

   private HashMap<String, Classics> classicBooks;
    public Classics(String author, String bookDescription, String price) {
        super(author,bookDescription,price);
        classicBooks = new HashMap<>();
        mapClassics();
    }

    private void mapClassics(){
        classicBooks.put("Pride and Prejudice", new Classics("Jane Austen", "A classic romantic novel that explores themes of love, societal expectations, and personal growth in Regency-era England.","This book costs 279.72 liras."));
        classicBooks.put("1984", new Classics("George Orwell", "A dystopian novel portraying a totalitarian regime where surveillance and propaganda dominate the lives of individuals.","This book costs 419.72 liras."));
        classicBooks.put("To Kill a Mockingbird", new Classics("Harper Lee", "A poignant tale of racial injustice and moral growth set in the Deep South during the 1930s.","This book costs 223.72 liras."));
        classicBooks.put("War and Peace", new Classics("Leo Tolstoy", "An epic masterpiece that intertwines the lives of individuals with the historical backdrop of the Napoleonic Wars in Russia.","This book costs 559.72 liras."));
        classicBooks.put("Crime and Punishment", new Classics("Fyodor Dostoevsky", "A psychological exploration of morality and redemption through the story of a conflicted young man who commits murder.","This book costs 335.72 liras."));
        classicBooks.put("Little Women", new Classics("Louisa May Alcott", "A heartwarming story of four sisters growing up during the American Civil War, facing love, loss, and personal ambitions.","This book costs 335.72 liras."));
        classicBooks.put("Anna Karenina", new Classics("Leo Tolstoy", "A tragic love story that examines the complexities of family, fidelity, and societal norms in Imperial Russia.","This book costs 447.72 liras."));
        classicBooks.put("The Picture of Dorian Gray", new Classics("Oscar Wilde", "A philosophical novel exploring themes of beauty, morality, and the consequences of living a hedonistic lifestyle.","This book costs 223.72 liras."));
        classicBooks.put("The Brothers Karamazov", new Classics("Fyodor Dostoevsky", "A profound narrative delving into faith, doubt, and the moral dilemmas faced by three brothers in 19th-century Russia.","This book costs 447.72 liras."));
        classicBooks.put("The Adventures of Sherlock Holmes", new Classics("Arthur Conan Doyle", "A collection of thrilling detective stories featuring the brilliant and eccentric detective Sherlock Holmes and his friend Dr. Watson.","This book costs 279.72 liras."));
    }

    public HashMap<String, Classics> getInfoClassics(){
        return classicBooks;
    }

}
