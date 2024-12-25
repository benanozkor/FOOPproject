package beverage;

import java.util.Map;

class Tea extends Hot {

    private static final Tea[] TEA_VARIETIES = {
            new Tea(
                    "Green Tea",
                    60,
                    "Healthy green tea",
                    new Recipe(
                            "Green Tea",
                            Map.of("Green tea leaves", 2.0, "Hot water", 250.0),
                            "3 minutes",
                            "Steep green tea leaves in hot water for 3 minutes.",
                            Map.of("Green tea leaves", "May contain caffeine")
                    )
            ),
            new Tea(
                    "Black Tea",
                    50,
                    "Traditional black tea",
                    new Recipe(
                            "Black Tea",
                            Map.of("Black tea leaves", 2.0, "Hot water", 250.0),
                            "4 minutes",
                            "Steep black tea leaves in hot water for 4 minutes.",
                            Map.of("Black tea leaves", "May contain caffeine")
                    )
            ),
            new Tea(
                    "Herbal Tea",
                    70,
                    "Relaxing herbal tea",
                    new Recipe(
                            "Herbal Tea",
                            Map.of("Herbal mix", 3.0, "Hot water", 250.0),
                            "5 minutes",
                            "Steep herbal mix in hot water for 5 minutes.",
                            Map.of("Herbal mix", "Contains natural herbs")
                    )
            )
    };

    private String description;
    private Recipe recipe;

    public Tea(String name, double price, String description, Recipe recipe) {
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

    public static Tea[] getAllTeas() {
        return TEA_VARIETIES;
    }

    public static void displayAllTeas() {
        for (Tea tea : TEA_VARIETIES) {
            System.out.println(tea.getName() + ": " + tea.getDescription());
            System.out.println("Recipe:");
            tea.getRecipe().displayRecipe(); // Tarifi detaylı olarak gösterir
            System.out.println();
        }
    }
}