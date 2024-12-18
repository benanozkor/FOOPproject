package books;

public class Classics extends Book {

    @Override
    public String bookDescription() {
        return "World classics are to express successful novels that continue to be read and admired even after many years and are among the best examples of the genre.";
    }
    public Classics("Pride and Prejudice", " Jane Austen", 448, 302.72, 1813){
        super(title, author, numberOfPages, price, publicationYear); //help @tuna elina error veriyo nası çözcem neyi yanlış yapıyorum
    }

}
