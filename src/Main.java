import java.util.Scanner;
import beverage.*;
import food.*;
import books.*;
import java.util.Arrays;

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
                if (costumerInput.equalsIgnoreCase("back")) continue;

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

    private static void handlePayment(Scanner scanner, BasketManager basketManager) {
        double total = basketManager.calculateTotalPrice();
        System.out.println("Total Price: " + total);

        System.out.println("Enter payment amount (TL):");
        double paymentAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        if (paymentAmount >= total) {
            double change = paymentAmount - total;
            System.out.println("Payment successful! Your change is TL" + change);
            basketManager.clearBasket();
        } else {
            System.out.println("Insufficient funds. Please enter a valid amount.");
        }
    }

    private static void handleBooksSection(Scanner scanner, BooksManager booksManager, BooksBasketManager booksBasketManager) {
        String costumerInput = "";  // Varsayılan olarak boş string atanıyor.
        while (true) {
            costumerInput = scanner.nextLine().trim();
            if (costumerInput.equalsIgnoreCase("exit")) break;
            if (costumerInput.equalsIgnoreCase("menu") || costumerInput.equalsIgnoreCase("back")) return;
            if (costumerInput.equalsIgnoreCase("basket")) {
                booksBasketManager.showBooksBasket();
                System.out.println("Type 'back' to return to menu or continue to add items.");
                String nextAction = scanner.nextLine().trim().toLowerCase();
                if (nextAction.equals("back")) {
                    break;
                }
            } else {
                try {
                    int sectionNumber = Integer.parseInt(costumerInput);
                    booksManager.booksBySection(String.valueOf(sectionNumber));
                } catch (NumberFormatException exception) {
                    Book chosenBook = booksManager.getBook(costumerInput);
                    booksBasketManager.addToBooksBasket(chosenBook);
                }
            }
        }
    }

    private static void handleFoodSection(Scanner scanner, MenuManager menuManager, BasketManager basketManager) {
        String costumerInput = "";  // Varsayılan olarak boş string atanıyor.
        while (true) {
            costumerInput = scanner.nextLine();
            if (costumerInput.equalsIgnoreCase("exit")) break;
            if (costumerInput.equalsIgnoreCase("menu") || costumerInput.equalsIgnoreCase("back")) return;
            if (costumerInput.equalsIgnoreCase("basket")) {
                basketManager.showBasket();
                boolean exitLoop = false;

                while (!exitLoop) {
                    // Display this prompt with the payment option after showing the basket
                    System.out.println("Type 'remove' to delete an item, 'payment' to proceed to payment, or 'back' to return to the previous menu.");
                    String action = scanner.nextLine().trim().toLowerCase();

                    if (action.equals("remove")) {
                        System.out.println("Enter the item number and quantity to remove (e.g., 3 1):");
                        String[] input = scanner.nextLine().trim().split(" ");
                        if (input.length == 2) {
                            try {
                                int itemNumber = Integer.parseInt(input[0]);
                                int quantity = Integer.parseInt(input[1]);
                                boolean itemRemoved = basketManager.removeFromBasketByIndex(itemNumber, quantity);

                                if (!itemRemoved) {
                                    System.out.println("The product could not be found in the basket. Please check the item number and try again.");
                                } else {
                                    System.out.println("Item removed successfully.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input format. Please enter a valid item number and quantity.");
                            }
                        } else {
                            System.out.println("Invalid input format. Correct format: 'itemNumber quantity'. Example: '3 1'");
                        }
                    } else if (action.equals("payment")) {
                        // Proceed to payment if the user chooses 'payment'
                        handlePayment(scanner, basketManager);
                        exitLoop = true;  // Exit the loop after payment
                    } else if (action.equals("back")) {
                        exitLoop = true;  // Exit the loop and return to the previous menu
                    } else {
                        System.out.println("Invalid command. Please enter 'remove', 'payment', or 'back'.");
                    }
                }
            } else {
                try {
                    int productNumber = Integer.parseInt(costumerInput);
                    Food chosenProduct = menuManager.getProductByNumber(productNumber);
                    basketManager.addToBasket(chosenProduct);
                } catch (NumberFormatException exception) {
                    Food chosenProduct = menuManager.findItemByName(costumerInput);
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
            if (costumerInput.equalsIgnoreCase("menu") || costumerInput.equalsIgnoreCase("back")) return;
            if (costumerInput.equalsIgnoreCase("basket")) {
                basketManager.showBasket();
                boolean exitLoop = false;

                while (!exitLoop) {
                    // Display the prompt with the 'payment' option
                    System.out.println("Type 'remove' to delete an item, 'payment' to proceed to payment, or 'back' to return to the previous menu.");
                    String action = scanner.nextLine().trim().toLowerCase();

                    if (action.equals("remove")) {
                        System.out.println("Enter the item number and quantity to remove (e.g., 3 1):");
                        String[] input = scanner.nextLine().trim().split(" ");
                        if (input.length == 2) {
                            try {
                                int itemNumber = Integer.parseInt(input[0]);
                                int quantity = Integer.parseInt(input[1]);
                                boolean itemRemoved = basketManager.removeFromBasketByIndex(itemNumber, quantity);

                                if (!itemRemoved) {
                                    System.out.println("The beverage could not be found in the basket. Please check the name and try again.");
                                } else {
                                    System.out.println("Item removed successfully.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input format. Please enter a valid item number and quantity.");
                            }
                        } else {
                            System.out.println("Invalid input format. Correct format: 'itemNumber quantity'. Example: '3 1'");
                        }
                    } else if (action.equals("payment")) {
                        // Proceed to payment if the user chooses 'payment'
                        handlePayment(scanner, basketManager);
                        exitLoop = true;  // Exit the loop after payment
                    } else if (action.equals("back")) {
                        exitLoop = true;  // Exit the loop and return to the previous menu
                    } else {
                        System.out.println("Invalid command. Please enter 'remove', 'payment', or 'back'.");
                    }
                }
            } else {
                try {
                    int productNumber = Integer.parseInt(costumerInput);
                    Beverage chosenBeverage = beverageMenuManager.getBeverageByNumber(productNumber);
                    if (chosenBeverage != null) {
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
                    } else {
                        System.out.println("Invalid product number.");
                    }
                } catch (NumberFormatException exception) {
                    Beverage chosenBeverage = beverageMenuManager.getBeverage(costumerInput.toLowerCase().trim());
                    if (chosenBeverage != null) {
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
                    } else {
                        System.out.println("The selected product is not available in the menu.");
                    }
                }
            }
        }
    }
}

