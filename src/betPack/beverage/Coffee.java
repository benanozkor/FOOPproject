package betPack.beverage;

class Coffee extends Hot {

    private static final Coffee[] COFFEES = {
            new Coffee("Americano", 105, "Espresso with water", new Recipe("Espresso", "Hot water")),
            new Coffee("Espresso", 75, "Strong coffee", new Recipe("Espresso shot")),
            new Coffee("Turkish Coffee", 90, "Traditional Turkish coffee", new Recipe("Ground coffee", "Water", "Sugar (optional)")),
            new Coffee("Latte", 135, "Coffee with steamed milk", new Recipe("Espresso", "Steamed milk")),
            new Coffee("Cappuccino", 120, "Coffee with steamed and frothed milk", new Recipe("Espresso", "Steamed milk", "Foamed milk")),
            new Coffee("Mocha", 150, "Coffee with chocolate and milk", new Recipe("Espresso", "Chocolate syrup", "Steamed milk")),
            new Coffee("Macchiato", 110, "Espresso with a small amount of milk foam", new Recipe("Espresso", "Milk foam")),
            new Coffee("Flat White", 140, "Steamed milk over espresso", new Recipe("Espresso", "Steamed milk"))
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
            System.out.println("Recipe: " + coffee.getRecipe());
            System.out.println();
        }
    }
}
