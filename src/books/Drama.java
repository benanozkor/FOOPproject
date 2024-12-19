package books;

public class Drama extends Book{

    @Override
    public String genreDescription() {
    return "The drama genre is strongly based in a character, or characters, that are in conflict at a crucial moment in their lives. Most dramas revolve around families and often have tragic or painful resolutions.";
    }

    public Drama(String title, String author, int numberOfPages, double price, int publicationYear) {
        super(title, author, numberOfPages, price, publicationYear);
    }
}
