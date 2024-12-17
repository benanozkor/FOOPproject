package betPack.beverage;

public class IcedTea extends Cold {

    public static final IcedTea ICED_BLACK_TEA = new IcedTea("Iced Black Tea", 45, "Refreshing black iced tea");
    public static final IcedTea ICED_GREEN_TEA = new IcedTea("Iced Green Tea", 50, "Refreshing green iced tea");
    public static final IcedTea ICED_HERBAL_TEA = new IcedTea("Iced Herbal Tea", 55, "Refreshing and healty herbal tea");
    public static final IcedTea BERRY_HIBISCUS = new IcedTea("Berry Hibiscus", 70, "Refreshing, tangy drink made with hibiscus and berries");

    private String description;

    private IcedTea(String name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }
    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllIcedTeas() {
        IcedTea[] icedTeas = {ICED_BLACK_TEA, ICED_GREEN_TEA, ICED_HERBAL_TEA, BERRY_HIBISCUS };
        for (IcedTea icedTea : icedTeas) {
            icedTea.display();
            System.out.println("Description: " + icedTea.getDescription());
            System.out.println("Price: " + icedTea.getPrice());
        }
    }
}
