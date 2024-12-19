package books;

public class Fantasy extends Book {
    @Override
    public String genreDescription(){
        return "Fantasy fiction is a genre of fiction that involves elements that cannot exist within the real world. This fictional universe includes things like magic, mythology, or life from other worlds or universes.";
    }
    public Fantasy(String title, String author, int numberOfPages, double price, int publicationYear) {
        super(title, author, numberOfPages, price, publicationYear);
    }
}
