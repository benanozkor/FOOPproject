package books;

public class Crime extends Book {

    @Override
    public String genreDescription() {
        return "The crime genre is largely classified by a story that is centered around the solving of a crime. The story needs a protagonist, usually some type of detective, whether a professional or an amateur or even a private investigator, who is determined to solve the crime.";
    }

    public Crime(String title, String author, int numberOfPages, double price, int publicationYear) {
        super(title, author, numberOfPages, price, publicationYear);
    }
}
