import books.Book;

import java.util.HashMap;

public class BooksBasketManager {
    private HashMap<Book, Integer> booksBasket;

    //adds book to basket
    public void addToBooksBasket(Book book){
        if(book.getQuantity() == 0){
            System.out.println("The selected book is sold out! ");
        }
        booksBasket.put(book,booksBasket.getOrDefault(book,0)+1);
        book.setQuantity(book.getQuantity() - 1);
        System.out.println(book.getTitle() + " Added to the basket ");
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
