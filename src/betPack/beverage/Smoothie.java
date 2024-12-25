package betPack.beverage;

import betPack.beverage.Cold;
import betPack.beverage.Recipe;
import betPack.beverage.Size;

class Smoothie extends Cold {

    private static final Smoothie[] SMOOTHIES = {
            new Smoothie("Berry Blast", 140, "A mix of strawberries, blueberries, and raspberries", new Recipe("Strawberries", "Blueberries", "Raspberries")),
            new Smoothie("Tropical", 150, "A blend of mango, pineapple, and banana", new Recipe("Mango", "Pineapple", "Banana")),
            new Smoothie("Green Detox", 160, "A healthy mix of spinach, kale, and green apple", new Recipe("Spinach", "Kale", "Green apple"))
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
            System.out.println("Recipe: " + smoothie.getRecipe());
            System.out.println();
        }
    }
}
