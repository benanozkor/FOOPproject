package betPack.beverage;

public class Coffee extends Hot {

    public static final Coffee AMERICANO = new Coffee("Americano", 105, "Espresso for losers.");
    public static final Coffee ESPRESSO = new Coffee("Espresso", 75, "Strong coffee.");
    public static final Coffee TURKISH = new Coffee("Turkish Coffee", 90, "Ur the legend g, keep drippin'.");
    public static final Coffee LATTE = new Coffee("Latte", 135, "Coffee with milk iste knk");
    public static final Coffee CAPPUCCINO = new Coffee("Cappuccino", 120, "Coffee with more milk.");
    public static final Coffee MOCHA = new Coffee("Mocha", 150, "Coffee but with chocolate.");

    private String description;

    public Coffee(String name, double price, String description) {
        super(name, price, Size.Small);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllCoffees() {
        Coffee[] coffees = {AMERICANO, ESPRESSO, TURKISH, LATTE, CAPPUCCINO, MOCHA };
        for (Coffee coffee : coffees) {
            coffee.display();
            System.out.println("Description: " + coffee.getDescription());
            System.out.println("Price: " + coffee.getPrice());
        }
    }



}
