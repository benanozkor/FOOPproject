package beverage;

import java.util.HashMap;
import java.util.Map;

public class Coffee extends Hot {

    public static final Coffee[] COFFEES = {
            new Coffee("Americano", 105, "Espresso with water"),
            new Coffee("Espresso", 75, "Strong coffee"),
            new Coffee("Turkish Coffee", 90, "Traditional Turkish coffee"),
            new Coffee("Latte", 135, "Coffee with steamed milk"),
            new Coffee("Cappuccino", 120, "Coffee with steamed and frothed milk"),
            new Coffee("Mocha", 150, "Coffee with chocolate and milk"),
            new Coffee("Macchiato", 110, "Espresso with a small amount of milk foam"),
            new Coffee("Flat White", 140, "Steamed milk over espresso"),
    };

    private String description;

    public Coffee(String name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }


    public static void displayAllCoffees() {
        for (Coffee coffee : COFFEES) {
            System.out.println(coffee.getName() + ": " + coffee.getDescription());
            System.out.println();
        }
    }

    public static Coffee getCoffeeByName(String name) {
        for (Coffee coffee : COFFEES) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                return coffee;
            }
        }
        return null;
    }
}