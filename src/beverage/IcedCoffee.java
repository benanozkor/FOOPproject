package beverage;

import java.util.HashMap;
import java.util.Map;

public class IcedCoffee extends Cold {

    public static final IcedCoffee[] ICED_COFFEES = {
            new IcedCoffee("Iced Latte", 130, "Cold coffee with milk"),
            new IcedCoffee("Iced Mocha", 140, "Cold coffee with chocolate"),
            new IcedCoffee("Iced Americano", 120, "Cold espresso diluted with water"),
            new IcedCoffee("Caramel Frappuccino", 160, "Blended coffee with caramel"),
            new IcedCoffee("Vanilla Iced Coffee", 135, "Cold coffee with vanilla flavor")
    };

    private static final Map<String, IcedCoffee> ICED_COFFEE_MAP = new HashMap<>();


    static {
        for (IcedCoffee icedCoffee : ICED_COFFEES) {
            ICED_COFFEE_MAP.put(icedCoffee.getName().toLowerCase(), icedCoffee);
        }
    }

    private String description;

    public IcedCoffee(String name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }


    public static void displayAllIcedCoffees() {
        for (IcedCoffee icedCoffee : ICED_COFFEES) {
            System.out.println(icedCoffee.getName() + ": " + icedCoffee.getDescription());
        }
    }


    public static IcedCoffee getIcedCoffeeByName(String name) {
        return ICED_COFFEE_MAP.get(name.toLowerCase());
    }
}
