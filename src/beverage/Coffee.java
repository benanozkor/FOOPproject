package beverage;

import java.util.HashMap;
import java.util.Map;

public class Coffee extends Hot {

    public static final Coffee[] COFFEES = {
            new Coffee("Americano", "ame", 105, "Espresso with water"),
            new Coffee("Espresso", "esp", 75, "Strong coffee"),
            new Coffee("Turkish Coffee", "turcof", 90, "Traditional Turkish coffee"),
            new Coffee("Latte", "lat", 135, "Coffee with steamed milk"),
            new Coffee("Cappuccino", "cap", 120, "Coffee with steamed and frothed milk"),
            new Coffee("Mocha", "moc", 150, "Coffee with chocolate and milk"),
            new Coffee("Macchiato", "mac", 110, "Espresso with a small amount of milk foam"),
            new Coffee("Flat White", "flatw", 140, "Steamed milk over espresso"),
    };

    private static final Map<String, Coffee> COFFEE_MAP = new HashMap<>();

    static {
        for (Coffee coffee : COFFEES) {
            COFFEE_MAP.put(coffee.getName().toLowerCase(), coffee);
            COFFEE_MAP.put(coffee.getAlias().toLowerCase(), coffee);  // Alias ekleniyor
        }
    }

    private String description;
    private String alias;  // Alias alanı eklendi

    // Alias destekli yapıcı metod
    public Coffee(String name, String alias, double price, String description) {
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

    // Tüm kahveleri gösteren metod (alias dahil)
    public static void displayAllCoffees() {
        for (Coffee coffee : COFFEES) {
            System.out.println(coffee.getName() + " (" + coffee.getAlias() + "): " + coffee.getDescription());
            System.out.println();
        }
    }

    // İsim veya alias ile kahve bulma
    public static Coffee getCoffeeByName(String name) {
        return COFFEE_MAP.get(name.toLowerCase());
    }
}
