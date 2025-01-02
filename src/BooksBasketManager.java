import book.Book;

import java.util.HashMap;

public class BooksBasketManager {
    private HashMap<Book, Integer> booksBasket;

    public BooksBasketManager(){
        this.booksBasket = new HashMap<>();
    }

    //adds book to basket
    public void addToBooksBasket(Book book){
        int quantity = book.getQuantity();
        if(quantity == 0){
            System.out.println("The selected book is sold out! ");
            return;
        }
        booksBasket.put(book,booksBasket.getOrDefault(book,0) + 1);
        book.setQuantity(quantity - 1);
        System.out.println(book.getTitle() + " Added to the basket ");
    }
    public Book getBookBasket(String title){
        for (Book book: booksBasket.keySet()){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        System.out.println("The book with the title '" + title + "' is not in the basket.");
        return null;
    }
    public double calculateTotal(){
        double total = 0.0;
        for (Book book : booksBasket.keySet()){
            total += book.getPrice() * booksBasket.get(book);
        }
        return total;
    }

    public void makePayment (double payment, double total){
        if (payment < total){
            System.out.println("Insufficient funds! Please type total.");
        } else if (payment > total) {
            System.out.println("Payment successful! Your money back : " + (payment - total));
        } else if (total == 0.0){
            System.out.println("Your basket is empty!");
        } else if (total == payment) {
            System.out.println("Payment successful!");
        }
    }
    public void removeBookBasket(Book book) {
        booksBasket.remove(book,booksBasket.get(book) + 1);
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " was removed from basket.");
    }
    public void showBooksBasket(){
        if(booksBasket.isEmpty()){
            System.out.println("Your basket is empty.");
            return;
        }
        System.out.println("Basket Contents: ");
        for (Book book: booksBasket.keySet()) {
            System.out.println(book.getTitle() + " - Quantity: "+ booksBasket.get(book));
        }
    }
}