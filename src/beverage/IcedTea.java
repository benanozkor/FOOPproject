package beverage;

import java.util.HashMap;
import java.util.Map;

public class IcedTea extends Cold {

    public static final IcedTea[] ICED_TEAS = {
            new IcedTea("Lemon Iced Tea", 80, "Refreshing lemon iced tea"),
            new IcedTea("Peach Iced Tea", 85, "Sweet peach iced tea"),
            new IcedTea("Mint Iced Tea", 90, "Cooling mint-flavored iced tea"),
            new IcedTea("Berry Iced Tea", 95, "Berry-infused iced tea"),
            new IcedTea("Hibiscus Iced Tea", 100, "Floral and tangy hibiscus iced tea")
    };

    private String description;

    public IcedTea(String name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static void displayAllIcedTeas() {
        for (IcedTea icedTea : ICED_TEAS) {
            System.out.println(icedTea.getName() + ": " + icedTea.getDescription());
            System.out.println("Recipe:");
            System.out.println();
        }
    }

    public static IcedTea getIceTeaByName(String name) {
        for (IcedTea iceTea : ICED_TEAS) {
            if (iceTea.getName().equalsIgnoreCase(name)) {
                return iceTea;
            }
        }
        return null;
    }
}
