import java.util.Scanner;
import beverage.*;
import food.*;
import books.*;

public class Main implements PrintOptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String costumerInput = "";  // Varsayılan olarak boş bir string atanıyor.

        MenuManager menuManager = new MenuManager();
        BasketManager basketManager = new BasketManager();
        BooksManager booksManager = new BooksManager();
        BooksBasketManager booksBasketManager = new BooksBasketManager();
        BeverageMenuManager beverageMenuManager = new BeverageMenuManager();

        while (true) {
            try {
                FileManager fileManager1 = new FileManager(welcomeFileName);
                fileManager1.createFileContent(welcome);
                fileManager1.printFileContent();
                costumerInput = scanner.nextLine().trim();

                if (costumerInput.equalsIgnoreCase("exit")) break;

                if (costumerInput.equalsIgnoreCase("books") || costumerInput.equalsIgnoreCase("3")) {
                    FileManager fileManager = new FileManager(booksFileName);
                    fileManager.createFileContent(booksContent);
                    fileManager.printFileContent();
                    handleBooksSection(scanner, booksManager, booksBasketManager);
                } else if (costumerInput.equalsIgnoreCase("food") || costumerInput.equalsIgnoreCase("2")) {
                    FileManager fileManager = new FileManager(menuFileName);
                    fileManager.createFileContent(menu);
                    fileManager.printFileContent();
                    handleFoodSection(scanner, menuManager, basketManager);
                } else if (costumerInput.equalsIgnoreCase("beverage") || costumerInput.equalsIgnoreCase("1")) {
                    FileManager fileManager = new FileManager(beveragesMenuName);
                    fileManager.createFileContent(beveragesMenu);
                    fileManager.printFileContent();
                    handleBeverageSection(scanner, beverageMenuManager, basketManager);
                }

            } catch (NullPointerException exception) {
                System.out.println("Input cannot be null! Please enter your choice. " + exception.getMessage());
            } catch (Exception exception) {
                System.out.println("Invalid value! Please enter your choice. " + exception.getMessage());
            }
        }
    }

    private static void handleBooksSection(Scanner scanner, BooksManager booksManager, BooksBasketManager booksBasketManager) {
        String costumerInput = "";  // Varsayılan olarak boş string atanıyor.
        while (true) {
            costumerInput = scanner.nextLine().trim();
            if (costumerInput.equalsIgnoreCase("exit")) break;
            if (costumerInput.equalsIgnoreCase("menu")) return;
            if (costumerInput.equalsIgnoreCase("basket")) {



                booksBasketManager.showBooksBasket();
                while (true) {
                    String nextAction = scanner.nextLine().trim().toLowerCase();
                    if (nextAction.equals("back")) break;
                    if (nextAction.equals("remove")) {
                        System.out.println("Type title of book to remove from your basket");
                        nextAction = scanner.nextLine().trim();
                        Book bookToRemove = booksBasketManager.getBookBasket(nextAction);
                        booksBasketManager.removeBookBasket(bookToRemove);
                    }
                    if (nextAction.equals("payment")) {
                        System.out.println("Your total is " + booksBasketManager.calculateTotalBooks() + "TL. Please type sum to make payment.");
                        nextAction = scanner.nextLine().trim();
                        booksBasketManager.makePaymentBooks(Double.parseDouble(nextAction), booksBasketManager.calculateTotalBooks());
                    }
                }

            }
            try {
                int sectionNumber = Integer.parseInt(costumerInput);
                booksManager.booksBySection(String.valueOf(sectionNumber));
            } catch (NumberFormatException exception) {
                Book chosenBook = booksManager.getBook(costumerInput);
                booksBasketManager.addToBooksBasket(chosenBook);
            }

        }
    }

    private static void handleFoodSection(Scanner scanner, MenuManager menuManager, BasketManager basketManager) {
        String costumerInput = "";  // Varsayılan olarak boş string atanıyor.
        while (true) {
            costumerInput = scanner.nextLine();
            if (costumerInput.equalsIgnoreCase("exit")) break;
            if (costumerInput.equalsIgnoreCase("menu")) return;
            if (costumerInput.equalsIgnoreCase("basket")) {
                basketManager.showBasket();
                System.out.println("Type 'back' to return to menu or continue to add items.");
                String nextAction = scanner.nextLine().trim().toLowerCase();
                if (nextAction.equals("back")) {
                    break;
                }
            } else {
                try {
                    int productNumber = Integer.parseInt(costumerInput);
                    Food chosenProduct = menuManager.getProductByNumber(productNumber);
                    basketManager.addToBasket(chosenProduct);
                } catch (NumberFormatException exception) {
                    Food chosenProduct = menuManager.getProduct(costumerInput);
                    basketManager.addToBasket(chosenProduct);
                }
            }
        }
    }

    private static void handleBeverageSection(Scanner scanner, BeverageMenuManager beverageMenuManager, BasketManager basketManager) {
        String costumerInput = "";  // Varsayılan olarak boş string atanıyor.
        while (true) {
            costumerInput = scanner.nextLine().trim();
            if (costumerInput.equalsIgnoreCase("exit")) break;
            if (costumerInput.equalsIgnoreCase("menu")) return;
            if (costumerInput.equalsIgnoreCase("basket")) {
                basketManager.showBasket();
                System.out.println("Type 'back' to return to menu or continue to add items.");
                String nextAction = scanner.nextLine().trim().toLowerCase();
                if (nextAction.equals("back")) {
                    break;
                }
            } else {
                try {
                    int productNumber = Integer.parseInt(costumerInput);
                    Beverage chosenBeverage = beverageMenuManager.getBeverageByNumber(productNumber);
                    System.out.println("Choose size of your beverage: Small, Medium, Large");
                    String sizeInput = scanner.nextLine().trim().toLowerCase();
                    Size selectedSize = switch (sizeInput) {
                        case "small" -> Size.Small;
                        case "medium" -> Size.Medium;
                        case "large" -> Size.Large;
                        default -> {
                            System.out.println("Invalid size! Defaulting to Small.");
                            yield Size.Small;
                        }
                    };
                    Beverage sizedBeverage = chosenBeverage.createWithNewSize(selectedSize);
                    basketManager.addBeverageToBasket(sizedBeverage);
                } catch (NumberFormatException exception) {
                    System.out.println("The selected product is not available in the menu.");
                }
            }
        }
    }
}