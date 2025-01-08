package managers;

import food.Desserts;
import food.Food;
import food.Salty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuManager {
    private HashMap<String, Food> menu;
    private ArrayList<String> orderedNames; // List to map to food names
    private HashMap<String, String> aliasMap;  // Alias mapping

    public MenuManager() {
        menu = new HashMap<>();
        orderedNames = new ArrayList<>();
        aliasMap = new HashMap<>();
        preloadMenu();
    }

    private void preloadMenu() {
        addMenuItem(new Desserts("Chocolate Cookie", "chocook", 70, 455, "Dessert", true, "chocolate"));
        addMenuItem(new Desserts("Christmas Cookie", "chriscook", 70, 455, "Dessert", true, "chocolate"));
        addMenuItem(new Desserts("Almond Cookie", "almcook", 70, 590, "Dessert", true, "Almond"));
        addMenuItem(new Desserts("Chocolate Layer Cake", "cholaycak", 100, 600, "Dessert", true, "chocolate"));
        addMenuItem(new Desserts("Red-Velvet Cake", "redvelcak", 100, 735, "Dessert", true, "chocolate"));
        addMenuItem(new Desserts("Strawberry Cake", "strcak", 100, 585, "Dessert", true, "chocolate"));
        addMenuItem(new Desserts("Cheesecake", "cheesek", 100, 590, "Dessert", false, "Almond"));
        addMenuItem(new Desserts("Espresso Brownie", "espbrow", 80, 600, "Dessert", true, "chocolate"));
        addMenuItem(new Desserts("Triple Chocolate", "tripchoc", 80, 590, "Dessert", false, "Almond"));
        addMenuItem(new Desserts("Frosted Brownie", "frosbrow", 80, 600, "Dessert", true, "chocolate"));
        addMenuItem(new Salty("Smoked Chicken Sandwich", "smochisan", 120, 756, "Salty", false, "chicken"));
        addMenuItem(new Salty("Ham and Cheese Sandwich", "hamchesan", 150, 726, "Salty", false, "Ham"));
        addMenuItem(new Salty("Vegetable Sandwich", "vegsand", 80, 308, "Salty", true, "vegetables"));
        addMenuItem(new Salty("Grilled Meat Sandwich", "grimeasan", 150, 756, "Salty", false, "meat"));
        addMenuItem(new Salty("Egged Sausage Sandwich", "eggsau", 120, 576, "Salty", false, "eggs"));
        addMenuItem(new Salty("Cheese Borek", "chebore", 70, 345, "Salty", false, "cheese"));
        addMenuItem(new Salty("Meat Borek", "meabore", 100, 436, "Salty", false, "chicken"));
        addMenuItem(new Salty("Potato Borek", "patbore", 70, 336, "Salty", true, "potato"));
    }

    public void addMenuItem(Food item) {
        menu.put(item.getProductName().toLowerCase(), item);  // Store items in lowercase
        aliasMap.put(item.getAlias().toLowerCase(), item.getProductName().toLowerCase());
        orderedNames.add(item.getProductName().toLowerCase());
    }

    public Food findItemByName(String name) {
        // Check by alias first, then by full name
        String realName = aliasMap.getOrDefault(name.toLowerCase(), name.toLowerCase());
        return menu.get(realName);
    }

    public Food getProductByNumber(int number) {
        if (number > 0 && number <= orderedNames.size()) {
            return menu.get(orderedNames.get(number - 1).toLowerCase());
        }
        return null;
    }
}
