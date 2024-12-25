package beverage;

import java.util.Map;


class IcedTea extends Cold {

    private static final IcedTea[] ICED_TEAS = {
            new IcedTea(
                    "Lemon Iced Tea",
                    80,
                    "Refreshing lemon iced tea",
                    new Recipe(
                            "Lemon Iced Tea",
                            Map.of("Black tea", 1.0, "Lemon", 20.0, "Ice cubes", 50.0, "Sugar (optional)", 10.0),
                            "5 minutes",
                            "Brew black tea, add lemon juice, sugar, and ice cubes.",
                            Map.of("Lemon", "Citrus")
                    )
            ),
            new IcedTea(
                    "Peach Iced Tea",
                    85,
                    "Sweet peach iced tea",
                    new Recipe(
                            "Peach Iced Tea",
                            Map.of("Black tea", 1.0, "Peach syrup", 30.0, "Ice cubes", 50.0),
                            "5 minutes",
                            "Brew black tea, mix in peach syrup, and add ice cubes.",
                            Map.of("Peach syrup", "Fruit-based sweetener")
                    )
            ),
            new IcedTea(
                    "Mint Iced Tea",
                    90,
                    "Cooling mint-flavored iced tea",
                    new Recipe(
                            "Mint Iced Tea",
                            Map.of("Green tea", 1.0, "Mint leaves", 10.0, "Ice cubes", 50.0, "Honey (optional)", 15.0),
                            "5 minutes",
                            "Brew green tea, add mint leaves, honey, and ice cubes.",
                            Map.of("Honey", "Natural sweetener")
                    )
            ),
            new IcedTea(
                    "Berry Iced Tea",
                    95,
                    "Berry-infused iced tea",
                    new Recipe(
                            "Berry Iced Tea",
                            Map.of("Black tea", 1.0, "Mixed berry syrup", 30.0, "Ice cubes", 50.0),
                            "5 minutes",
                            "Brew black tea, mix in berry syrup, and add ice cubes.",
                            Map.of("Mixed berry syrup", "Fruit-based sweetener")
                    )
            ),
            new IcedTea(
                    "Hibiscus Iced Tea",
                    100,
                    "Floral and tangy hibiscus iced tea",
                    new Recipe(
                            "Hibiscus Iced Tea",
                            Map.of("Hibiscus tea", 1.0, "Ice cubes", 50.0, "Lemon slice", 10.0, "Honey (optional)", 15.0),
                            "5 minutes",
                            "Brew hibiscus tea, add lemon slice, honey, and ice cubes.",
                            Map.of("Hibiscus tea", "Flower-based infusion")
                    )
            )
    };

    private String description;
    private Recipe recipe;

    public IcedTea(String name, double price, String description, Recipe recipe) {
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

    public static void displayAllIcedTeas() {
        for (IcedTea icedTea : ICED_TEAS) {
            System.out.println(icedTea.getName() + ": " + icedTea.getDescription());
            System.out.println("Recipe:");
            icedTea.getRecipe().displayRecipe(); // Tarifi detaylı olarak gösterir
            System.out.println();
        }
    }
}