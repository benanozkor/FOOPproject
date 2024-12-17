package betPack.beverage;

public class IcedCoffee extends Cold {
    public static final IcedCoffee ICED_LATTE = new IcedCoffee("Iced Latte", 135, "A refreshing iced latte");
    public static final IcedCoffee ICED_AMERICANO = new IcedCoffee("Iced Americano", 120, "A refreshing iced americano");
    public static final IcedCoffee ICED_CARAMEL_LATTE = new IcedCoffee("Iced Caramel Latte", 150, "A sweet latte with caramel");

    private String description;

    private IcedCoffee(name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllIcedCoffees() {
        IcedCoffee[] IcedCoffees = {ICED_LATTE, ICED_AMERICANO, ICED_CARAMEL_LATTE};
        for (IcedCoffee icedCoffee : IcedCoffees) {
            icedCoffee.display();
            System.out.println("Description: " + icedCoffee.getDescription());
            System.out.println("Price: " + icedCoffee.getPrice());
        }
    }
}
