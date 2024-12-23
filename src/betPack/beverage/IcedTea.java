package betPack.beverage;

class IcedTea extends Cold {

    private static final IcedTea[] ICED_TEAS = {
            new IcedTea("Lemon Iced Tea", 80, "Refreshing lemon iced tea", new Recipe("Black tea", "Lemon", "Ice cubes", "Sugar (optional)")),
            new IcedTea("Peach Iced Tea", 85, "Sweet peach iced tea", new Recipe("Black tea", "Peach syrup", "Ice cubes")),
            new IcedTea("Mint Iced Tea", 90, "Cooling mint-flavored iced tea", new Recipe("Green tea", "Mint leaves", "Ice cubes", "Honey (optional)")),
            new IcedTea("Berry Iced Tea", 95, "Berry-infused iced tea", new Recipe("Black tea", "Mixed berry syrup", "Ice cubes")),
            new IcedTea("Hibiscus Iced Tea", 100, "Floral and tangy hibiscus iced tea", new Recipe("Hibiscus tea", "Ice cubes", "Lemon slice", "Honey (optional)"))
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
            System.out.println("Recipe: " + icedTea.getRecipe());
            System.out.println();
        }
    }
}
