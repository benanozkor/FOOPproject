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
            coffee.getRecipe().displayRecipe();
            System.out.println();
        }
    }

    // Method to create recipes for predefined coffee drinks
    private static Recipe createRecipe(String coffeeName) {
        Map<String, Double> ingredients = new HashMap<>();
        Map<String, String> allergens = new HashMap<>();
        String preparationTime = "Varies by coffee type";
        String instructions = "";

        switch (coffeeName) {
            case "Americano":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Hot Water", 120.0);
                instructions = "Add hot water to espresso.";
                break;

            case "Espresso":
                ingredients.put("Espresso", 60.0);
                instructions = "Brew espresso using an espresso machine.";
                break;

            case "Turkish Coffee":
                ingredients.put("Ground Coffee", 50.0);
                ingredients.put("Water", 100.0);
                ingredients.put("Sugar (optional)", 10.0);
                instructions = "Boil coffee and water together in a cezve. Add sugar if desired.";
                break;

            case "Latte":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Steamed Milk", 150.0);
                allergens.put("Steamed Milk", "Lactose");
                instructions = "Combine espresso with steamed milk.";
                break;

            case "Cappuccino":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Steamed Milk", 100.0);
                ingredients.put("Foamed Milk", 50.0);
                allergens.put("Steamed Milk", "Lactose");
                instructions = "Layer steamed milk and foamed milk over espresso.";
                break;

            case "Mocha":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Chocolate Syrup", 30.0);
                ingredients.put("Steamed Milk", 150.0);
                allergens.put("Steamed Milk", "Lactose");
                instructions = "Mix chocolate syrup with espresso, then add steamed milk.";
                break;

            case "Macchiato":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Milk Foam", 30.0);
                allergens.put("Milk Foam", "Lactose");
                instructions = "Top espresso with a dollop of milk foam.";
                break;

            case "Flat White":
                ingredients.put("Espresso", 60.0);
                ingredients.put("Steamed Milk", 150.0);
                allergens.put("Steamed Milk", "Lactose");
                instructions = "Pour steamed milk over espresso evenly.";
                break;
        }

        return new Recipe(coffeeName, ingredients, preparationTime, instructions, allergens);
    }
}