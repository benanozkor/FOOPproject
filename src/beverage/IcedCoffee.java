package beverage;

import java.util.HashMap;
import java.util.Map;

public class IcedCoffee extends Cold {

    public static final IcedCoffee[] ICED_COFFEES = {
            new IcedCoffee("Iced Latte", "icelat", 130, "Cold coffee with milk"),
            new IcedCoffee("Iced Mocha", "icemoc", 140, "Cold coffee with chocolate"),
            new IcedCoffee("Iced Americano", "iceame", 120, "Cold espresso diluted with water"),
            new IcedCoffee("Caramel Frappuccino", "carfra", 160, "Blended coffee with caramel"),
            new IcedCoffee("Vanilla Iced Coffee", "vanicof", 135, "Cold coffee with vanilla flavor")
    };

    private static final Map<String, IcedCoffee> ICED_COFFEE_MAP = new HashMap<>();

    static {
        for (IcedCoffee icedCoffee : ICED_COFFEES) {
            ICED_COFFEE_MAP.put(icedCoffee.getName().toLowerCase(), icedCoffee);
            ICED_COFFEE_MAP.put(icedCoffee.getAlias().toLowerCase(), icedCoffee);
        }
    }

    private String description;
    private String alias;  // Alias field added

    public IcedCoffee(String name, String alias, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllIcedCoffees() {
        for (IcedCoffee icedCoffee : ICED_COFFEES) {
            System.out.println(icedCoffee.getName() + " (" + icedCoffee.getAlias() + "): " + icedCoffee.getDescription());
        }
    }
}
