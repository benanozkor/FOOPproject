package betPack;
import beverage.Size;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Double> ingredients;
    private Map<String, Double> ingredientPrices;
    private Map<String, Integer> cups;
    private Map<String, Double> cupPrices;

    public Inventory() {
        this.ingredients = new HashMap<>();
        this.ingredientPrices = new HashMap<>();
        this.cups = new HashMap<>();
        this.cupPrices = new HashMap<>();
        initializeIngredients();
        initializeIngredientPrices();
        initializeCups();
        initializeCupPrices();
    }

    private void initializeIngredients() {
        addIngredient("Espresso", 1000.0);
        addIngredient("Hot Water", 5000.0);
        addIngredient("Ground Coffee", 500.0);
        addIngredient("Water", 5000.0);
        addIngredient("Sugar (optional)", 200.0);
        addIngredient("Steamed Milk", 3000.0);
        addIngredient("Foamed Milk", 1000.0);
        addIngredient("Chocolate Syrup", 500.0);
        addIngredient("Milk Foam", 500.0);
        addIngredient("Cold Milk", 3000.0);
        addIngredient("Cold Water", 5000.0);
        addIngredient("Caramel Syrup", 500.0);
        addIngredient("Vanilla Syrup", 500.0);
        addIngredient("Black tea leaves", 200.0);
        addIngredient("Green tea leaves", 200.0);
        addIngredient("Herbal mix", 200.0);
        addIngredient("Lemon", 100.0);
        addIngredient("Peach syrup", 500.0);
        addIngredient("Mint leaves", 100.0);
        addIngredient("Mixed berry syrup", 500.0);
        addIngredient("Hibiscus tea", 200.0);
        addIngredient("Strawberries", 500.0);
        addIngredient("Blueberries", 500.0);
        addIngredient("Raspberries", 500.0);
        addIngredient("Mango", 500.0);
        addIngredient("Pineapple", 500.0);
        addIngredient("Banana", 500.0);
        addIngredient("Spinach", 500.0);
        addIngredient("Kale", 500.0);
        addIngredient("Green apple", 500.0);
        addIngredient("Ice", 10000.0);
        addIngredient("Whipped cream", 500.0);
    }

    private void initializeIngredientPrices() {
        addIngredientPrice("Espresso", 0.05);
        addIngredientPrice("Hot Water", 0.001);
        addIngredientPrice("Ground Coffee", 0.02);
        addIngredientPrice("Water", 0.001);
        addIngredientPrice("Sugar (optional)", 0.01);
        addIngredientPrice("Steamed Milk", 0.005);
        addIngredientPrice("Foamed Milk", 0.006);
        addIngredientPrice("Chocolate Syrup", 0.02);
        addIngredientPrice("Milk Foam", 0.007);
        addIngredientPrice("Cold Milk", 0.005);
        addIngredientPrice("Cold Water", 0.001);
        addIngredientPrice("Caramel Syrup", 0.025);
        addIngredientPrice("Vanilla Syrup", 0.022);
        addIngredientPrice("Black tea leaves", 0.03);
        addIngredientPrice("Green tea leaves", 0.04);
        addIngredientPrice("Herbal mix", 0.035);
        addIngredientPrice("Lemon", 0.5); //adet fiyatı
        addIngredientPrice("Peach syrup", 0.02);
        addIngredientPrice("Mint leaves", 0.2); //adet fiyatı
        addIngredientPrice("Mixed berry syrup", 0.028);
        addIngredientPrice("Hibiscus tea", 0.032);
        addIngredientPrice("Strawberries", 0.015);
        addIngredientPrice("Blueberries", 0.02);
        addIngredientPrice("Raspberries", 0.025);
        addIngredientPrice("Mango", 0.012);
        addIngredientPrice("Pineapple", 0.01);
        addIngredientPrice("Banana", 0.008);
        addIngredientPrice("Spinach", 0.005);
        addIngredientPrice("Kale", 0.007);
        addIngredientPrice("Green apple", 0.01);
        addIngredientPrice("Ice", 0.0001);
        addIngredientPrice("Whipped cream", 0.03);

    }

    private void initializeCups() {
        addCup("Small Cardboard Cup", 100);
        addCup("Medium Cardboard Cup", 100);
        addCup("Large Cardboard Cup", 100);
        addCup("Small Plastic Cup", 100);
        addCup("Medium Plastic Cup", 100);
        addCup("Large Plastic Cup", 100);
    }

    private void initializeCupPrices() {
        addCupPrice("Small Cardboard Cup", 0.5);
        addCupPrice("Medium Cardboard Cup", 0.75);
        addCupPrice("Large Cardboard Cup", 1.0);
        addCupPrice("Small Plastic Cup", 0.25);
        addCupPrice("Medium Plastic Cup", 0.35);
        addCupPrice("Large Plastic Cup", 0.5);
    }

    public void addIngredient(String name, double amount) {
        ingredients.put(name, ingredients.getOrDefault(name, 0.0) + amount);
    }

    public void removeIngredient(String name, double amount) {
        if (ingredients.containsKey(name)) {
            double currentAmount = ingredients.get(name);
            if (currentAmount >= amount) {
                ingredients.put(name, currentAmount - amount);
            } else {
                System.out.println("Not enough " + name + " in stock.");
            }
        } else {
            System.out.println(name + " is not in the inventory.");
        }
    }

    public double getIngredientAmount(String name) {
        return ingredients.getOrDefault(name, 0.0);
    }

    public void addIngredientPrice(String name, double price) {
        ingredientPrices.put(name, price);
    }

    public double getIngredientPrice(String name) {
        return ingredientPrices.getOrDefault(name, 0.0);
    }

    public double calculateIngredientCost(String name, double amount) {
        return getIngredientPrice(name) * amount;
    }

    public void addCup(String type, int count) {
        cups.put(type, cups.getOrDefault(type, 0) + count);
    }

    public void removeCup(String type, int count) {
        if (cups.containsKey(type)) {
            int currentCount = cups.get(type);
            if (currentCount >= count) {
                cups.put(type, currentCount - count);
            } else {
                System.out.println("Not enough " + type + " in stock.");
            }
        } else {
            System.out.println(type + " is not in the inventory.");
        }
    }

    public int getCupCount(String type) {
        return cups.getOrDefault(type, 0);
    }

    public void addCupPrice(String type, double price) {
        cupPrices.put(type, price);
    }

    public double getCupPrice(String type) {
        return cupPrices.size();
    }
}