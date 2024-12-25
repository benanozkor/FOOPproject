package beverage;

import java.util.Map;


class Smoothie extends Cold {

    private static final Smoothie[] SMOOTHIES = {
            new Smoothie(
                    "Berry Blast",
                    140,
                    "A mix of strawberries, blueberries, and raspberries",
                    new Recipe(
                            "Berry Blast",
                            Map.of("Strawberries", 100.0, "Blueberries", 50.0, "Raspberries", 50.0),
                            "5 minutes",
                            "Blend all the ingredients together until smooth.",
                            Map.of("Berries", "May contain natural sugars")
                    )
            ),
            new Smoothie(
                    "Tropical",
                    150,
                    "A blend of mango, pineapple, and banana",
                    new Recipe(
                            "Tropical",
                            Map.of("Mango", 100.0, "Pineapple", 100.0, "Banana", 100.0),
                            "5 minutes",
                            "Blend mango, pineapple, and banana together until smooth.",
                            Map.of("Banana", "May cause allergies in sensitive individuals")
                    )
            ),
            new Smoothie(
                    "Green Detox",
                    160,
                    "A healthy mix of spinach, kale, and green apple",
                    new Recipe(
                            "Green Detox",
                            Map.of("Spinach", 50.0, "Kale", 50.0, "Green apple", 100.0),
                            "5 minutes",
                            "Blend spinach, kale, and green apple together until smooth.",
                            Map.of("Green apple", "Contains natural acids")
                    )
            )
    };

    private String description;
    private Recipe recipe;

    public Smoothie(String name, double price, String description, Recipe recipe) {
        super(name, price, Size.Small, true);
        this.description = description;
        this.recipe = recipe;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public static void displayAllSmoothies() {
        for (Smoothie smoothie : SMOOTHIES) {
            System.out.println(smoothie.getName() + ": " + smoothie.getDescription());
            System.out.println("Recipe:");
            smoothie.getRecipe().displayRecipe(); // Tarifi detaylı olarak gösterir
            System.out.println();
        }
    }
}