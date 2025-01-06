package beverage;

import java.util.HashMap;
import java.util.Map;

public class Tea extends Hot {
    public static final Tea[] TEAS = {
            new Tea("Earl Grey", "eargre", 50, "Classic Earl Grey tea"),
            new Tea("Green Tea", "gretea", 45, "Refreshing green tea"),
            new Tea("Chamomile Tea", "chamtea", 55, "Relaxing chamomile tea"),
            new Tea("Peppermint Tea", "peptea", 50, "Cooling peppermint tea"),
            new Tea("Jasmine Tea", "jastea", 60, "Aromatic jasmine tea")
    };

    private static final Map<String, Tea> TEA_MAP = new HashMap<>();

    static {
        for (Tea tea : TEAS) {
            TEA_MAP.put(tea.getName().toLowerCase(), tea);
            TEA_MAP.put(tea.getAlias().toLowerCase(), tea);
        }
    }

    private String description;
    private String alias;

    public Tea(String name, String alias, double price, String description) {
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

    public static void displayAllTeas() {
        for (Tea tea : TEAS) {
            System.out.println(tea.getName() + " (" + tea.getAlias() + "): " + tea.getDescription());
            System.out.println();
        }
    }
}
