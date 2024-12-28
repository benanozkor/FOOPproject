import books.Book;
import books.Classics;
import food.*;

import java.io.IOException;
import java.util.Scanner;

public class Main implements PrintOptions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String costumerInput;

        MenuManager menuManager = new MenuManager();
        BasketManager basketManager = new BasketManager();
        BooksManager booksManager = new BooksManager();
        BooksBasketManager booksBasketManager = new BooksBasketManager();



        while (true) {
            try {
                // Creating welcome file and printing to the console
                FileManager fileManager1 = new FileManager(welcomeFileName);
                fileManager1.createFileContent(welcome);
                fileManager1.printFileContent();
                costumerInput = scanner.nextLine().trim();
                if (costumerInput.equalsIgnoreCase("exit")) break;


                // Checking if user choose books and if yes creating books file and print content
                if (costumerInput.equalsIgnoreCase("books") || costumerInput.equalsIgnoreCase("3")) {
                    FileManager fileManager = new FileManager(booksFileName);
                    fileManager.createFileContent(booksContent);
                    fileManager.printFileContent();
                    while (true) {
                        costumerInput = scanner.nextLine().trim();
                        if (costumerInput.equalsIgnoreCase("exit")) break;

                        else if (costumerInput.equalsIgnoreCase("basket")) {
                            while (true) {
                                booksBasketManager.showBooksBasket();
                                costumerInput = scanner.nextLine().trim();
                                //booksBasketManager.removeBookBasket(booksBasketManager.getBookBasket(costumerInput));
                                if (costumerInput.equalsIgnoreCase("payment")){
                                    while (true) {
                                        System.out.println("Your total is: " + booksBasketManager.calculateTotal() + " Please type exact total to make payment!");
                                        costumerInput = String.valueOf(scanner.nextDouble());
                                        booksBasketManager.makePayment(Double.parseDouble(costumerInput), booksBasketManager.calculateTotal());

                                    }

                                }
                            }

                        } else {
                            Book chosenBook;
                            try {
                                int sectionNumber = Integer.parseInt(costumerInput);
                                booksManager.booksBySection(String.valueOf(sectionNumber));
                            } catch (NumberFormatException exception) {
                                chosenBook = booksManager.getBook(costumerInput);
                                booksBasketManager.addToBooksBasket(chosenBook);
                            }
                        }
                    }
                    // Checking if user choose food and if yes creating food file and print content

                } else if (costumerInput.equalsIgnoreCase("food") || costumerInput.equalsIgnoreCase("2")) {
                        FileManager fileManager = new FileManager(menuFileName);
                        fileManager.createFileContent(menu);
                        fileManager.printFileContent();
                    while (true) {
                        costumerInput = scanner.nextLine();
                        // break the while loop
                        if (costumerInput.equalsIgnoreCase("exit")) {
                            break;
                            //showing basket
                        } else if (costumerInput.equalsIgnoreCase("basket")) {
                            basketManager.showBasket();
                        }
                        Food chosenProduct = null;
                        try {
                            // Checking if input is a number
                            int productNumber = Integer.parseInt((costumerInput));
                            chosenProduct = menuManager.getProductByNumber(productNumber);
                            basketManager.addToBasket(chosenProduct);
                            // if not number assume it is a product name
                        } catch (NumberFormatException exception) {
                            chosenProduct = menuManager.getProduct(costumerInput);
                            basketManager.addToBasket(chosenProduct);
                        }

                    }

                    // Checking if user choose coffee and if yes creating coffee file and print content
                } else if (costumerInput.equalsIgnoreCase("coffee") || costumerInput.equalsIgnoreCase("1")) {
                    System.out.println("coffee");
                }
            } catch (NullPointerException exception) {
                System.out.println("Input can not be null! Please enter your choice. " + exception.getMessage());
            } catch (Exception exception) {
                System.out.println("Invalid value! Please enter your choice. " + exception.getMessage());
            }
        }



    }

}