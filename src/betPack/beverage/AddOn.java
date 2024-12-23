package betPack.beverage;

class AddOn {
    private String name;
    private double price;

    public static final AddOn EXTRA_CREAM = new AddOn("Extra Cream", 15);
    public static final AddOn CARAMEL_SYRUP = new AddOn("Caramel Syrup", 20);
    public static final AddOn EXTRA_ESPRESSO_SHOT = new AddOn("Extra Espresso Shot", 25);
    public static final AddOn VANILLA_SYRUP = new AddOn("Vanilla Syrup", 20);
    public static final AddOn HONEY = new AddOn("Honey", 10);
    public static final AddOn CINNAMON = new AddOn("Cinnamon", 5);

    public AddOn(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}