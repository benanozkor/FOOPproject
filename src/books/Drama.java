package books;

import java.util.HashMap;

public class Drama extends Book {

    @Override
    public String genreDescription() {
        return "The drama genre is strongly based in a character, or characters, that are in conflict at a crucial moment in their lives. Most dramas revolve around families and often have tragic or painful resolutions.";
    }

    private HashMap<String, Drama> dramaBooks;

    public Drama(String author, String bookDescription, String price) {
        super(author, bookDescription, price);
        dramaBooks = new HashMap<>();
        mapDrama();
    }

    private void mapDrama() {
        dramaBooks.put("Death of a Salesman", new Drama("Arthur Miller", "A poignant drama exploring the struggles of an aging salesman grappling with failure and unrealized dreams.", "This book costs 380.80 liras"));
        dramaBooks.put("Hamlet", new Drama("William Shakespeare", "A timeless tragedy about revenge, madness, and the moral dilemmas faced by Prince Hamlet of Denmark.", "This book costs 280.53 liras"));
        dramaBooks.put("The Sun Also Rises", new Drama("Ernest Hemingway", "A compelling tale of love, disillusionment, and the Lost Generation's post-World War I experiences.", "This book costs 300.03 liras"));
        dramaBooks.put("Brave New World", new Drama("Aldous Huxley", "A dystopian novel envisioning a future society controlled by technology, conditioning, and a lack of individuality.", "This book costs 280.4 liras"));
        dramaBooks.put("The Glass Menagerie", new Drama("Tennessee Williams", "A touching memory play about family, fragility, and the pursuit of happiness.", "This book costs 300.1 liras"));
        dramaBooks.put("Macbeth", new Drama("William Shakespeare", "A dark tragedy about ambition, power, and the destructive consequences of unchecked desire.", "This book costs 275.8 liras"));
        dramaBooks.put("The Seven Husbands of Evelyn Hugo", new Drama("Taylor Jenkins Reid", "A captivating story of fame, love, and the secrets of a Hollywood icon told through a journalist's eyes.", "This book costs 298.67 liras"));
        dramaBooks.put("The Book Thief", new Drama("Markus Zusak", "A heart-wrenching story set in Nazi Germany, narrated by Death, about a young girl's love for books and survival.", "This book costs 306.4 liras"));
        dramaBooks.put("Me Before You", new Drama("Jojo Moyes", "A deeply emotional tale of love, loss, and the life-changing bond between two unlikely individuals.", "This book costs 317.3 liras"));
        dramaBooks.put("A Little Life", new Drama("Hanya Yanagihara", "A powerful and intense drama following four college friends as they navigate trauma, relationships, and success in New York City.", "This book costs 399.6 liras"));
    }

    public HashMap<String, Drama> getInfoDrama() {
        return dramaBooks;
    }
}
