package books;

public class Classics extends Book {

    @Override
    public String genreDescription() {
        return "World classics are to express successful novels that continue to be read and admired even after many years and are among the best examples of the genre.";
    }

    public Classics(String title, String author, int numberOfPages, double price, int publicationYear){
        super(title, author, numberOfPages, price, publicationYear);
    }

}
