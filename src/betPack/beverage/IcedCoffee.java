package betPack.beverage;

class IcedCoffee extends Cold {

    private static final IcedCoffee[] ICED_COFFEES = {
            new IcedCoffee("Iced Latte", 130, "Cold coffee with milk", new Recipe("Espresso", "Cold milk", "Ice cubes")),
            new IcedCoffee("Iced Mocha", 140, "Cold coffee with chocolate", new Recipe("Espresso", "Chocolate syrup", "Cold milk", "Ice cubes")),
            new IcedCoffee("Iced Americano", 120, "Cold espresso diluted with water", new Recipe("Espresso", "Cold water", "Ice cubes")),
            new IcedCoffee("Caramel Frappuccino", 160, "Blended coffee with caramel", new Recipe("Espresso", "Caramel syrup", "Milk", "Ice", "Whipped cream")),
            new IcedCoffee("Vanilla Iced Coffee", 135, "Cold coffee with vanilla flavor", new Recipe("Espresso", "Vanilla syrup", "Cold milk", "Ice cubes"))
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
