package beverage;

import java.util.Map;


class IcedCoffee extends Cold {

    private static final IcedCoffee[] ICED_COFFEES = {
            new IcedCoffee(
                    "Iced Latte",
                    130,
                    "Cold coffee with milk",
                    new Recipe(
                            "Iced Latte",
                            Map.of("Espresso", 1.0, "Cold milk", 200.0, "Ice cubes", 50.0),
                            "5 minutes",
                            "Mix espresso with milk and ice cubes.",
                            Map.of("Milk", "Dairy")
                    )
            ),
            new IcedCoffee(
                    "Iced Mocha",
                    140,
                    "Cold coffee with chocolate",
                    new Recipe(
                            "Iced Mocha",
                            Map.of("Espresso", 1.0, "Chocolate syrup", 30.0, "Cold milk", 200.0, "Ice cubes", 50.0),
                            "5 minutes",
                            "Mix espresso with chocolate syrup, milk, and ice cubes.",
                            Map.of("Milk", "Dairy", "Chocolate syrup", "Cocoa")
                    )
            ),
            new IcedCoffee(
                    "Iced Americano",
                    120,
                    "Cold espresso diluted with water",
                    new Recipe(
                            "Iced Americano",
                            Map.of("Espresso", 1.0, "Cold water", 200.0, "Ice cubes", 50.0),
                            "3 minutes",
                            "Dilute espresso with cold water and add ice cubes.",
                            Map.of()
                    )
            ),
            new IcedCoffee(
                    "Caramel Frappuccino",
                    160,
                    "Blended coffee with caramel",
                    new Recipe(
                            "Caramel Frappuccino",
                            Map.of("Espresso", 1.0, "Caramel syrup", 30.0, "Milk", 200.0, "Ice", 50.0, "Whipped cream", 50.0),
                            "7 minutes",
                            "Blend all ingredients and top with whipped cream.",
                            Map.of("Milk", "Dairy", "Caramel syrup", "Sugar")
                    )
            ),
            new IcedCoffee(
                    "Vanilla Iced Coffee",
                    135,
                    "Cold coffee with vanilla flavor",
                    new Recipe(
                            "Vanilla Iced Coffee",
                            Map.of("Espresso", 1.0, "Vanilla syrup", 30.0, "Cold milk", 200.0, "Ice cubes", 50.0),
                            "5 minutes",
                            "Mix espresso with vanilla syrup, milk, and ice cubes.",
                            Map.of("Milk", "Dairy", "Vanilla syrup", "Flavoring")
                    )
            )
    };

    private String description;
    private Recipe recipe;

    public IcedCoffee(String name, double price, String description, Recipe recipe) {
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

    public static void displayAllIcedCoffees() {
        for (IcedCoffee icedCoffee : ICED_COFFEES) {
            System.out.println(icedCoffee.getName() + ": " + icedCoffee.getDescription());
            System.out.println("Recipe: " + icedCoffee.getRecipe());
            System.out.println();
        }
    }
}
