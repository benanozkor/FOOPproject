package beverage;

import betPack.Inventory; // Make sure this is the correct package for your Inventory class. Remove if Inventory is in the same package.
import java.util.Map;

public class Recipe {
    private String name;
    private Map<String, Double> ingredients;
    private String preparationTime;
    private String instructions;
    private Map<String, String> allergens;

    public Recipe(String name, Map<String, Double> ingredients, String preparationTime, String instructions, Map<String, String> allergens) {
        this.name = name;
        this.ingredients = ingredients;
        this.preparationTime = preparationTime;
        this.instructions = instructions;
        this.allergens = allergens;
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getIngredients() {
        return ingredients;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public String getInstructions() {
        return instructions;
    }

    public Map<String, String> getAllergens() {
        return allergens;
    }

    public boolean prepare() {
        System.out.println("Preparing: " + name);
        for (Map.Entry<String, Double> entry : ingredients.entrySet()) {
            String ingredient = entry.getKey();
            double amount = entry.getValue();
            if (!Inventory.removeIngredient(ingredient, amount)) {
                System.out.println("Failed to prepare " + name + ". Missing ingredient: " + ingredient + " (" + amount + ")"); // Show the amount as well
                return false;
            }
            System.out.println("Used " + amount + " grams of " + ingredient + "."); // Show the amount used
        }
        System.out.println(name + " is ready!");
        return true;
    }

    public void displayRecipe() {
        System.out.println("Recipe: " + name);
        System.out.println("Ingredients:");
        ingredients.forEach((ingredient, amount) ->
                System.out.println("- " + ingredient + ": " + amount + " grams"));
        System.out.println("Preparation Time: " + preparationTime);
        System.out.println("Instructions: " + instructions);
        if (!allergens.isEmpty()) {
            System.out.println("Allergens:");
            allergens.forEach((ingredient, allergen) ->
                    System.out.println("- " + ingredient + ": " + allergen));
        }
    }
}