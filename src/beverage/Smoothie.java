package beverage;

import java.util.HashMap;
import java.util.Map;

public class Smoothie extends Cold {
    public static final Smoothie[] SMOOTHIES = {
            new Smoothie("Strawberry Smoothie", "strsmoo", 120, "Creamy strawberry smoothie"),
            new Smoothie("Mango Smoothie", "mangsmoo", 130, "Tropical mango smoothie"),
            new Smoothie("Blueberry Smoothie", "blusmoo", 125, "Antioxidant-rich blueberry smoothie"),
            new Smoothie("Banana Smoothie", "bansmoo", 110, "Classic banana smoothie"),
            new Smoothie("Green Smoothie", "gresmoo", 135, "Healthy green smoothie")
    };

    private static final Map<String, Smoothie> SMOOTHIE_MAP = new HashMap<>();

    static {
        for (Smoothie smoothie : SMOOTHIES) {
            SMOOTHIE_MAP.put(smoothie.getName().toLowerCase(), smoothie);
            SMOOTHIE_MAP.put(smoothie.getAlias().toLowerCase(), smoothie);
        }
    }

    private String description;
    private String alias;

    public Smoothie(String name, String alias, double price, String description) {
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

    public static void displayAllSmoothies() {
        for (Smoothie smoothie : SMOOTHIES) {
            System.out.println(smoothie.getName() + " (" + smoothie.getAlias() + "): " + smoothie.getDescription());
            System.out.println();
        }
    }

    public static Smoothie getSmoothieByName(String name) {
        Smoothie smoothie = SMOOTHIE_MAP.get(name.toLowerCase());
        return smoothie != null ? smoothie : null;
    }
}
