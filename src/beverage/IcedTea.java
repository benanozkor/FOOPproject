package beverage;
import java.util.HashMap;
import java.util.Map;

import beverage.Cold;

public class IcedTea extends Cold {
    public static final IcedTea[] ICED_TEAS = {
            new IcedTea("Lemon Iced Tea", "lemicetea", 80, "Refreshing lemon iced tea"),
            new IcedTea("Peach Iced Tea", "peaicetea", 85, "Sweet peach iced tea"),
            new IcedTea("Mint Iced Tea", "minicetea", 90, "Cooling mint-flavored iced tea"),
            new IcedTea("Berry Iced Tea", "bericetea", 95, "Berry-infused iced tea"),
            new IcedTea("Hibiscus Iced Tea", "hibicetea", 100, "Floral and tangy hibiscus tea")
    };

    private static final Map<String, IcedTea> ICED_TEA_MAP = new HashMap<>();

    static {
        for (IcedTea icedTea : ICED_TEAS) {
            ICED_TEA_MAP.put(icedTea.getName().toLowerCase(), icedTea);
            ICED_TEA_MAP.put(icedTea.getAlias().toLowerCase(), icedTea);
        }
    }

    private String description;
    private String alias;

    public IcedTea(String name, String alias, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
