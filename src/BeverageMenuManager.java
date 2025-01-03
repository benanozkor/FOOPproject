import beverage.*;

import java.util.ArrayList;
import java.util.HashMap;

public class BeverageMenuManager {
    private HashMap<String, Beverage> beverageMenu;
    private ArrayList<String> beverageOrderedNames;

    public BeverageMenuManager(){
        beverageMenu = new HashMap<>();
        beverageOrderedNames = new ArrayList<>();
        preloadMenu();
    }
    private void preloadMenu(){
        addBeverageMenuItem( new Coffee("americano", 105, "Espresso with water"));
        addBeverageMenuItem( new Coffee("espresso", 75, "Strong coffee"));
        addBeverageMenuItem( new Coffee("turkish Coffee", 90, "Traditional Turkish coffee"));
        addBeverageMenuItem( new Coffee("latte", 135, "Coffee with steamed milk"));
        addBeverageMenuItem( new Coffee("cappuccino", 120, "Coffee with steamed and frothed milk"));
        addBeverageMenuItem( new Coffee("mocha", 150, "Coffee with chocolate and milk"));
        addBeverageMenuItem( new Coffee("macchiato", 110, "Espresso with a small amount of milk foam"));
        addBeverageMenuItem( new Coffee("flat white", 140, "Steamed milk over espresso"));
        addBeverageMenuItem( new Tea("earl grey", 50, "Classic Earl Grey tea"));
        addBeverageMenuItem( new Tea("green tea", 45, "Refreshing green tea"));
        addBeverageMenuItem( new Tea("chamomile tea", 55, "Relaxing chamomile tea"));
        addBeverageMenuItem( new Tea("peppermint tea", 50, "Cooling peppermint tea"));
        addBeverageMenuItem( new Tea("jasmine tea", 60, "Aromatic jasmine tea"));
        addBeverageMenuItem( new IcedCoffee("iced latte", 130, "Cold coffee with milk"));
        addBeverageMenuItem( new IcedCoffee("iced mocha", 140, "Cold coffee with chocolate"));
        addBeverageMenuItem( new IcedCoffee("iced americano", 120, "Cold espresso diluted with water"));
        addBeverageMenuItem( new IcedCoffee("caramel frappuccino", 160, "Blended coffee with caramel"));
        addBeverageMenuItem( new IcedCoffee("vanilla iced Coffee", 135, "Cold coffee with vanilla flavor"));
        addBeverageMenuItem( new IcedTea("lemon iced tea", 80, "Refreshing lemon iced tea"));
        addBeverageMenuItem( new IcedTea("peach iced tea", 85, "Sweet peach iced tea"));
        addBeverageMenuItem( new IcedTea("mint iced tea", 90, "Cooling mint-flavored iced tea"));
        addBeverageMenuItem( new IcedTea("berry iced tea", 95, "Berry-infused iced tea"));
        addBeverageMenuItem( new IcedTea("hibiscus iced tea", 100, "Floral and tangy hibiscus iced tea"));
        addBeverageMenuItem( new Smoothie("strawberry smoothie", 120, "Creamy strawberry smoothie"));
        addBeverageMenuItem( new Smoothie("mango smoothie", 130, "Tropical mango smoothie"));
        addBeverageMenuItem( new Smoothie("blueberry smoothie", 125, "Antioxidant-rich blueberry smoothie"));
        addBeverageMenuItem( new Smoothie("banana smoothie", 110, "Classic banana smoothie"));
        addBeverageMenuItem(new Smoothie("green smoothie", 135, "Healthy green smoothie"));

    }
    private void addBeverageMenuItem(Beverage beverage){
        beverageMenu.put(beverage.getName(),beverage);
        beverageOrderedNames.add(beverage.getName());
    }
    public Beverage getBeverage(String name) {
        return beverageMenu.get(name);
    }
    public Beverage getBeverageByNumber(int number){
        if(number < 1 || number > beverageOrderedNames.size()){
            System.out.println("Invalid product number.");
            return null;
        }
        String name = beverageOrderedNames.get(number - 1);
        return beverageMenu.get(name);
    }
    public Beverage chooseSize(String size, Beverage beverage){
        double price = 0;
        switch (size){
            case "medium":
                price = beverage.getPrice() * 1.2;
                break;
            case "large":
                price = beverage.getPrice() * 1.5;
                break;
            default:
                price = beverage.getPrice() * 1;
                break;
        }
        beverage.setPrice(price);
        return beverage;
    }



}
