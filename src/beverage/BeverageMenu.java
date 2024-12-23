package beverage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeverageMenu {

    private String title;
    private List<MenuItem> menuItems;
    private Scanner scanner;

    public BeverageMenu(String title) {
        this.title = title;
        this.menuItems = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addMenuItem(String text, Runnable action) {
        menuItems.add(new MenuItem(text, action));
    }

    public void display() {
        System.out.println("\n" + title);
        System.out.println("--------------------");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getText());
        }
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {
        int choice;
        do {
            display();
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
                display();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice > 0 && choice <= menuItems.size()) {
                menuItems.get(choice - 1).getAction().run();
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        System.out.println("Exiting...");
    }

    private class MenuItem {
        private String text;
        private Runnable action;

        public MenuItem(String text, Runnable action) {
            this.text = text;
            this.action = action;
        }

        public String getText() {
            return text;
        }

        public Runnable getAction() {
            return action;
        }
    }

    public static void main(String[] args) {
        BeverageMenu mainMenu = new BeverageMenu("Java Cafe Menu");

        mainMenu.addMenuItem("Hot Beverages", () -> {
            BeverageMenu hotDrinksMenu = new BeverageMenu("Hot Beverages");
            hotDrinksMenu.addMenuItem("Coffees", Coffee::displayAllCoffees);
            hotDrinksMenu.addMenuItem("Teas", Tea::displayAllTeas);
            hotDrinksMenu.run();
        });

        mainMenu.addMenuItem("Cold Beverages", () -> {
            BeverageMenu coldDrinksMenu = new BeverageMenu("Cold Beverages");
            coldDrinksMenu.addMenuItem("Iced Coffees", IcedCoffee::displayAllIcedCoffees);
            coldDrinksMenu.addMenuItem("Iced Teas", IcedTea::displayAllIcedTeas);
            coldDrinksMenu.addMenuItem("Smoothies", Smoothie::displayAllSmoothies);
            coldDrinksMenu.run();
        });

        mainMenu.run();
    }
}