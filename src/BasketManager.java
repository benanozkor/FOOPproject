
import beverage.Beverage;
import food.Food;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketManager {
    private final Map<String, Beverage> beverageBasket;  // İçecekler için ayrı bir basket
    private final Map<String, Food> foodBasket;          // Yemekler için ayrı bir basket

    public BasketManager() {
        beverageBasket = new HashMap<>();
        foodBasket = new HashMap<>();
    }

    // Adds a food product to the Basket
    public void addToBasket(Food food) {
        if (food == null) {
            System.out.println("The selected product is not available in the menu.");
            return;
        }
        String key = food.getProductName().toLowerCase();
        if (foodBasket.containsKey(key)) {
            Food existingFood = foodBasket.get(key);
            existingFood.setQuantity(existingFood.getQuantity() + 1);
            System.out.println(food.getProductName() + " quantity increased to " + existingFood.getQuantity() + ".");
        } else {
            food.setQuantity(1);
            foodBasket.put(key, food);
            System.out.println(food.getProductName() + " added to the basket.");
        }
    }

    // Adds a beverage to the Basket
    public void addBeverageToBasket(Beverage beverage) {
        if (beverage != null) {
            String key = (beverage.getName() + beverage.getSize().getName()).toLowerCase();
            if (beverageBasket.containsKey(key)) {
                Beverage existingBeverage = beverageBasket.get(key);
                existingBeverage.addToBasket();
                System.out.println(beverage.getName() + " (" + beverage.getSize().getName() + ") quantity increased to " + existingBeverage.getQuantity() + ".");
            } else {
                beverageBasket.put(key, beverage);
                System.out.println(beverage.getName() + " (" + beverage.getSize().getName() + ") added to the basket.");
            }
        } else {
            System.out.println("The selected product is not available in the menu.");
        }
    }

    // Removes a specific quantity of a beverage or food product from the Basket
    public void removeFromBasket(String productName, String size, int quantity) {
        String key = (productName + (size != null ? size : "")).toLowerCase();

        if (size != null && beverageBasket.containsKey(key)) {
            Beverage beverage = beverageBasket.get(key);
            if (beverage.getQuantity() > quantity) {
                beverage.setQuantity(beverage.getQuantity() - quantity);
                System.out.println(quantity + " " + productName + " (" + size + ") removed from the basket.");
            } else {
                beverageBasket.remove(key);
                System.out.println(productName + " (" + size + ") completely removed from the basket.");
            }
        } else if (foodBasket.containsKey(productName.toLowerCase())) {
            Food food = foodBasket.get(productName.toLowerCase());
            if (food.getQuantity() > quantity) {
                food.setQuantity(food.getQuantity() - quantity);
                System.out.println(quantity + " " + productName + " removed from the basket.");
            } else {
                foodBasket.remove(productName.toLowerCase());
                System.out.println(productName + " completely removed from the basket.");
            }
        } else {
            System.out.println(productName + " is not in the basket.");
        }
    }

    // Displays the contents of the Basket and allows removing items
    public void showBasket() {
        if (beverageBasket.isEmpty() && foodBasket.isEmpty()) {
            System.out.println("Your basket is empty.");
            return;
        }
        System.out.println("Basket Contents:");

        for (Beverage beverage : beverageBasket.values()) {
            beverage.display();
        }
        for (Food food : foodBasket.values()) {
            System.out.println(food.getProductName() + " - Quantity: " + food.getQuantity() + ", Total Price: TL" + (food.getPrice() * food.getQuantity()));
        }

        System.out.println("Type 'remove' to delete an item, 'back' to return to menu.");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine().trim().toLowerCase();

        if (action.equals("remove")) {
            System.out.println("Enter the name, size (if applicable), and quantity of the item to remove (e.g., espresso small 1):");
            String[] input = scanner.nextLine().trim().split(" ");
            if (input.length >= 2) {
                String productName = input[0];
                String size = input.length > 2 ? input[1] : null;
                int quantity = input.length > 2 ? Integer.parseInt(input[2]) : Integer.parseInt(input[1]);
                removeFromBasket(productName, size, quantity);
            } else {
                System.out.println("Invalid input. Please provide product name, size, and quantity.");
            }
        }
    }

    // Calculates total price
    public double calculateTotal() {
        double total = 0.0;
        for (Beverage beverage : beverageBasket.values()) {
            total += beverage.getPrice() * beverage.getQuantity();
        }
        for (Food food : foodBasket.values()) {
            total += food.getPrice() * food.getQuantity();
        }
        return total;
    }
}
