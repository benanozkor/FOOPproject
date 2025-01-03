package beverage;

public class Smoothie extends Cold{
    public static final Smoothie[] SMOOTHIES = {
            new Smoothie("Strawberry Smoothie", 120, "Creamy strawberry smoothie"),
            new Smoothie("Mango Smoothie", 130, "Tropical mango smoothie"),
            new Smoothie("Blueberry Smoothie", 125, "Antioxidant-rich blueberry smoothie"),
            new Smoothie("Banana Smoothie", 110, "Classic banana smoothie"),
            new Smoothie("Green Smoothie", 135, "Healthy green smoothie")
    };

    private String description;

    public Smoothie(String name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllSmoothies() {
        for (Smoothie smoothie : SMOOTHIES) {
            System.out.println(smoothie.getDescription() + ": " + smoothie.getDescription());
            System.out.println();
        }
    }

    public static Smoothie getSmoothieByName(String name) {
        for (Smoothie smoothie : SMOOTHIES) {
            if (smoothie.getDescription().equalsIgnoreCase(name)) {
                return smoothie;
            }
        }
        return null;
    }

}
