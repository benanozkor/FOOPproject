package beverage;

import java.util.Map;
import java.util.HashMap;

public class Tea extends Hot {

    public static final Tea[] TEAS = {
            new Tea("Earl Grey", 50, "Classic Earl Grey tea"),
            new Tea("Green Tea", 45, "Refreshing green tea"),
            new Tea("Chamomile Tea", 55, "Relaxing chamomile tea"),
            new Tea("Peppermint Tea", 50, "Cooling peppermint tea"),
            new Tea("Jasmine Tea", 60, "Aromatic jasmine tea")
    };

    private String description;

    public Tea(String name, double price, String description) {
        super(name, price, Size.Small, true);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }


    public static void displayAllTeas() {
        for (Tea tea : TEAS) {
            System.out.println(tea.getName() + ": " + tea.getDescription());
            System.out.println();
        }
    }

}