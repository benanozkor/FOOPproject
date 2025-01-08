package managers;

import betCafepackage.BetCafe;
import betCafepackage.CafeItem;
import beverage.Beverage;
import food.Food;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class BasketManager {
    private final Map<String, Beverage> beverageBasket;  // İçecekler için ayrı bir basket
    private final Map<String, Food> foodBasket;          // Yemekler için ayrı bir basket

    public BasketManager() {
        beverageBasket = new HashMap<>();
        foodBasket = new HashMap<>();
    }

    public void addToBasket(Food food) {
        if (food == null) {
            System.out.println("The selected product is not available in the menu.");
            return;
        }
        String key = food.getProductName().toLowerCase().trim().replaceAll("\\s+", " ");

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

    public void addBeverageToBasket(Beverage beverage) {
        if (beverage != null) {
            String key = beverage.getName().toLowerCase().trim().replaceAll("\\s+", " ");
            if (beverage.getSize() != null) {
                key += "/" + beverage.getSize().getName().toLowerCase().trim();
            }

            if (beverageBasket.containsKey(key)) {
                Beverage existingBeverage = beverageBasket.get(key);
                existingBeverage.addToBasket();
                System.out.println(beverage.getName() + " (" + beverage.getSize().getName() + ") quantity increased to " + existingBeverage.getQuantity() + ".");
            } else {
                beverageBasket.put(key, beverage);
                System.out.println(beverage.getName() + " (" + (beverage.getSize() != null ? beverage.getSize().getName() : "N/A") + ") added to the basket.");
            }
        } else {
            System.out.println("The selected product is not available in the menu.");
        }
    }

    public boolean removeFromBasketByIndex(int index, int quantity) {
        int currentIndex = 1;
        boolean itemFound = false;

        for (Map.Entry<String, Beverage> entry : beverageBasket.entrySet()) {
            if (currentIndex == index) {
                Beverage beverage = entry.getValue();
                if (beverage.getQuantity() > quantity) {
                    beverage.setQuantity(beverage.getQuantity() - quantity);
                    System.out.println(quantity + " " + beverage.getName() + " (" + beverage.getSize().getName() + ") removed from the basket.");
                } else {
                    beverageBasket.remove(entry.getKey());
                    System.out.println(beverage.getName() + " (" + beverage.getSize().getName() + ") completely removed from the basket.");
                }
                itemFound = true;
                break;
            }
            currentIndex++;
        }

        for (Map.Entry<String, Food> entry : foodBasket.entrySet()) {
            if (currentIndex == index) {
                Food food = entry.getValue();
                if (food.getQuantity() > quantity) {
                    food.setQuantity(food.getQuantity() - quantity);
                    System.out.println(quantity + " " + food.getProductName() + " removed from the basket.");
                } else {
                    foodBasket.remove(entry.getKey());
                    System.out.println(food.getProductName() + " completely removed from the basket.");
                }
                itemFound = true;
                break;
            }
            currentIndex++;
        }

        if (!itemFound) {
            System.out.println("Item with index " + index + " is not in the basket.");
        }

        return itemFound;
    }

    public void showBasket() {
        if (beverageBasket.isEmpty() && foodBasket.isEmpty()) {
            System.out.println("Your basket is empty.");
            return;
        }
        System.out.println("Basket Contents:");
        int itemNumber = 1;

        for (Beverage beverage : beverageBasket.values()) {
            String aliasPart = (beverage.getAlias() != null && !beverage.getAlias().isEmpty()) ? " (Alias: " + beverage.getAlias() + ")" : "";
            String sizePart = (beverage.getSize() != null) ? " (" + beverage.getSize().getName() + ")" : "";
            System.out.println(itemNumber + ". " + beverage.getName() + aliasPart + sizePart + " - Quantity: " + beverage.getQuantity() +
                    ", Total Price: TL" + String.format("%.2f", beverage.calculateTotalPrice()));
            itemNumber++;
        }

        for (Food food : foodBasket.values()) {
            String aliasPart = (food.getAlias() != null && !food.getAlias().isEmpty()) ? " (Alias: " + food.getAlias() + ")" : "";
            System.out.println(itemNumber + ". " + food.getProductName() + aliasPart + " - Quantity: " + food.getQuantity() +
                    ", Total Price: TL" + String.format("%.2f", food.calculateTotalPrice()));
            itemNumber++;
        }
        System.out.println("Type 'remove' to delete an item, 'payment' to proceed to payment, or 'back' to return to the previous menu.");
    }

    // Calculate the total price of all items in the basket (both food and beverages)
    public double calculateTotalPrice() {
        double totalPrice = 0;

        // Calculate total price for beverages
        for (Beverage beverage : beverageBasket.values()) {
            totalPrice += beverage.calculateTotalPrice();  // Assuming each beverage has a method to calculate its price
        }

        // Calculate total price for food
        for (Food food : foodBasket.values()) {
            totalPrice += food.calculateTotalPrice();  // Assuming each food has a method to calculate its price
        }

        return totalPrice;
    }

    // Clears the basket by removing all items
    public void clearBasket() {
        beverageBasket.clear();
        foodBasket.clear();
        System.out.println("Basket has been cleared.");
    }
}
