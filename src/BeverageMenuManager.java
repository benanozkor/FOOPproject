import beverage.*;

import java.util.ArrayList;
import java.util.HashMap;

public class BeverageMenuManager {
    private HashMap<String, Beverage> beverageMenu;
    private ArrayList<String> beverageOrderedNames;

    public BeverageMenuManager() {
        beverageMenu = new HashMap<>();
        beverageOrderedNames = new ArrayList<>();
        preloadMenu();
    }

    private void preloadMenu() {
        // Coffee
        addBeverageMenuItem(new Coffee("Americano", "ame", 105, "Espresso with water"));
        addBeverageMenuItem(new Coffee("Espresso", "esp", 75, "Strong coffee"));
        addBeverageMenuItem(new Coffee("Turkish Coffee", "turcof", 90, "Traditional Turkish coffee"));
        addBeverageMenuItem(new Coffee("Latte", "lat", 135, "Coffee with steamed milk"));
        addBeverageMenuItem(new Coffee("Cappuccino", "cap", 120, "Coffee with steamed and frothed milk"));
        addBeverageMenuItem(new Coffee("Mocha", "moc", 150, "Coffee with chocolate and milk"));
        addBeverageMenuItem(new Coffee("Macchiato", "mac", 110, "Espresso with a small amount of milk foam"));
        addBeverageMenuItem(new Coffee("Flat White", "flatw", 140, "Steamed milk over espresso"));

        // Tea
        addBeverageMenuItem(new Tea("Earl Grey", "eargre", 50, "Classic Earl Grey tea"));
        addBeverageMenuItem(new Tea("Green Tea", "gretea", 45, "Refreshing green tea"));
        addBeverageMenuItem(new Tea("Chamomile Tea", "chamtea", 55, "Relaxing chamomile tea"));
        addBeverageMenuItem(new Tea("Peppermint Tea", "peptea", 50, "Cooling peppermint tea"));
        addBeverageMenuItem(new Tea("Jasmine Tea", "jastea", 60, "Aromatic jasmine tea"));

        // Iced Coffee
        addBeverageMenuItem(new IcedCoffee("Iced Latte", "icelat", 130, "Cold coffee with milk"));
        addBeverageMenuItem(new IcedCoffee("Iced Mocha", "icemoc", 140, "Cold coffee with chocolate"));
        addBeverageMenuItem(new IcedCoffee("Iced Americano", "iceame", 120, "Cold espresso diluted with water"));
        addBeverageMenuItem(new IcedCoffee("Caramel Frappuccino", "carfra", 160, "Blended coffee with caramel"));
        addBeverageMenuItem(new IcedCoffee("Vanilla Iced Coffee", "vanicof", 135, "Cold coffee with vanilla flavor"));

        // Iced Tea
        addBeverageMenuItem(new IcedTea("Lemon Iced Tea", "lemicetea", 80, "Refreshing lemon iced tea"));
        addBeverageMenuItem(new IcedTea("Peach Iced Tea", "peaicetea", 85, "Sweet peach iced tea"));
        addBeverageMenuItem(new IcedTea("Mint Iced Tea", "minicetea", 90, "Cooling mint-flavored iced tea"));
        addBeverageMenuItem(new IcedTea("Berry Iced Tea", "bericetea", 95, "Berry-infused iced tea"));
        addBeverageMenuItem(new IcedTea("Hibiscus Iced Tea", "hibicetea", 100, "Floral and tangy hibiscus iced tea"));

        // Smoothie
        addBeverageMenuItem(new Smoothie("Strawberry Smoothie", "strawsmoo", 120, "Creamy strawberry smoothie"));
        addBeverageMenuItem(new Smoothie("Mango Smoothie", "mangsmoo", 130, "Tropical mango smoothie"));
        addBeverageMenuItem(new Smoothie("Blueberry Smoothie", "bluesmoo", 125, "Antioxidant-rich blueberry smoothie"));
        addBeverageMenuItem(new Smoothie("Banana Smoothie", "bansmoo", 110, "Classic banana smoothie"));
        addBeverageMenuItem(new Smoothie("Green Smoothie", "gresmoo", 135, "Healthy green smoothie"));
    }

    // Alias destekli içecek ekleme
    private void addBeverageMenuItem(Beverage beverage) {
        beverageMenu.put(beverage.getName().toLowerCase().trim(), beverage);
        beverageMenu.put(beverage.getAlias().toLowerCase().trim(), beverage);  // Alias ekleme
        beverageOrderedNames.add(beverage.getName().toLowerCase().trim());
    }

    public Beverage getBeverage(String name) {
        return beverageMenu.get(name.toLowerCase().trim());
    }

    public Beverage getBeverageByNumber(int number) {
        if (number < 1 || number > beverageOrderedNames.size()) {
            System.out.println("Invalid product number.");
            return null;
        }
        String name = beverageOrderedNames.get(number - 1);
        return beverageMenu.get(name.toLowerCase());
    }

    // İçeceğin boyutunu değiştir
    public Beverage chooseSize(String size, Beverage beverage) {
        Size newSize;
        switch (size.toLowerCase()) {
            case "medium":
                newSize = Size.Medium;
                break;
            case "large":
                newSize = Size.Large;
                break;
            default:
                newSize = Size.Small;
                break;
        }
        return beverage.createWithNewSize(newSize);
    }
}
