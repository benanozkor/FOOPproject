package beverage;

import java.util.HashMap;
import java.util.Map;

class Coffee extends Hot {

    private static final Coffee[] COFFEES = {
            new Coffee("Americano", 105, "Espresso with water", createRecipe("Americano")),
            new Coffee("Espresso", 75, "Strong coffee", createRecipe("Espresso")),
            new Coffee("Turkish Coffee", 90, "Traditional Turkish coffee", createRecipe("Turkish Coffee")),
            new Coffee("Latte", 135, "Coffee with steamed milk", createRecipe("Latte")),
            new Coffee("Cappuccino", 120, "Coffee with steamed and frothed milk", createRecipe("Cappuccino")),
            new Coffee("Mocha", 150, "Coffee with chocolate and milk", createRecipe("Mocha")),
            new Coffee("Macchiato", 110, "Espresso with a small amount of milk foam", createRecipe("Macchiato")),
            new Coffee("Flat White", 140, "Steamed milk over espresso", createRecipe("Flat White"))
    };

    private String description;
    private Recipe recipe;

    public Coffee(String name, double price, String description, Recipe recipe) {
        super(name, price, Size.Small);
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

    public static void displayAllCoffees() {
        for (Coffee coffee : COFFEES) {
            System.out.println(coffee.getName() + ": " + coffee.getDescription());
            System.out.println("Recipe:");
            coffee.getRecipe().getIngredients().forEach((ingredient, amount) ->
                    System.out.println(ingredient + ": " + amount + " grams"));
            System.out.println();
        }
    }

    // Method to create recipes for predefined coffee drinks
    private static Recipe createRecipe(String coffeeName) {
        Map<String, Double> ingredients = new HashMap<>();
        Map<String, String> allergens = new HashMap<>();

        switch (coffeeName) {
            case "Americano":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Hot Water", 120.0);
                break;

            case "Espresso":
                ingredients.put("Espresso", 60.0);
                break;

            case "Turkish Coffee":
                ingredients.put("Ground Coffee", 50.0);
                ingredients.put("Water", 100.0);
                ingredients.put("Sugar (optional)", 10.0);
                break;

            case "Latte":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Steamed Milk", 150.0);
                allergens.put("Steamed Milk", "Lactose");
                break;

            case "Cappuccino":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Steamed Milk", 100.0);
                ingredients.put("Foamed Milk", 50.0);
                allergens.put("Steamed Milk", "Lactose");
                break;

            case "Mocha":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Chocolate Syrup", 30.0);
                ingredients.put("Steamed Milk", 150.0);
                allergens.put("Steamed Milk", "Lactose");
                break;

            case "Macchiato":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Milk Foam", 30.0);
                allergens.put("Milk Foam", "Lactose");
                break;

            case "Flat White":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Steamed Milk", 150.0);
                allergens.put("Steamed Milk", "Lactose");
                break;
        }

        return new Recipe(coffeeName, ingredients, "Varies by coffee type", "Follow standard preparation instructions.", allergens);
    }
}
