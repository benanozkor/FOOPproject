import food.*;

import java.util.Scanner;

public class Main implements PrintOptions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String costumerInput;

        MenuManager menuManager = new MenuManager();

        String booksContent = """
                Welcome to Books section!
                --------------------
                1. it       - $3.00
                2. titanic     - $3.50
                3. flowers for el          - $4.00
                4. bcjs            - $2.50
                5. Sandwich       - $5.00
                6. Cake Slice     - $4.50
                --------------------
                Enjoy your meal!
                """;

        String menu = """
                Welcome to Our Cafe!
                --------------------
                1. Espresso       - $3.00
                2. Cappuccino     - $3.50
                3. Latte          - $4.00
                4. Tea            - $2.50
                5. Sandwich       - $5.00
                6. Cake Slice     - $4.50
                --------------------
                Enjoy your meal!
                """;

        String menuFileName = "CafeMenu.txt";
        String booksFileName = "BooksSection.txt";


        while (true) {
            try {
                PrintOptions.welcomePrint();
                costumerInput = scanner.nextLine();

                if (costumerInput.equalsIgnoreCase("books") || costumerInput.equalsIgnoreCase("1")) {
                    // Create an instance of FileManager
                    FileManager fileManager = new FileManager(booksFileName);
                    // Create the file and write the menu
                    fileManager.createMenuFileContent(booksContent);
                    // Print the file content
                    fileManager.printMenuFileContent();
                } else if (costumerInput.equalsIgnoreCase("cafe") || costumerInput.equalsIgnoreCase("2")) {
                    // Create an instance of FileManager
                    FileManager fileManager = new FileManager(menuFileName);
                    // Create the file and write the menu
                    fileManager.createMenuFileContent(menu);
                    // Print the file content
                    fileManager.printMenuFileContent();
                    costumerInput = scanner.nextLine();
                    Food chosenProduct = menuManager.getProduct(costumerInput);
                    if (chosenProduct != null) {
                        System.out.println("You chose: " + chosenProduct.getProductName());
                        System.out.println("Price: $" + chosenProduct.getProductPrise());
                    } else {
                        System.out.println("Sorry, we don't have " + chosenProduct + " on the menu.");
                    }
                }
            } catch (NullPointerException exception) {
                System.out.println("Input can not be null! Please enter your choice" + exception.getMessage());
            } catch (Exception exception) {
                System.out.println("Invalid value! Please enter your choice" + exception.getMessage());
            }


        }
    }

}