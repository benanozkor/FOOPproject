package betPack.beverage;

public class Tea extends Hot{

    public static final Tea BLACK_TEA = new Tea("Black Tea", 40,"Traditional black tea");
    public static final Tea GREEN_TEA = new Tea("Green Tea", 45,"Healty green tea");
    public static final Tea HERBAL_TEA = new Tea("Herbal Tea", 50,"Tea made with various herbs");

    private String description;

    private Tea(String name, double price, String description) {
        super(name, price, Size.Small);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllTeas() {
        Tea[] teas = { BLACK_TEA, GREEN_TEA, HERBAL_TEA };
        for (Tea tea : teas) {
            tea.display();
            System.out.println("Description: " + tea.getDescription());
            System.out.println("Price: " + tea.getPrice());
        }
    }
}
