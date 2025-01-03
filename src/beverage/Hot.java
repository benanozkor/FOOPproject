package beverage;

import beverage.Beverage;

public class Hot extends Beverage {

    public Hot(String name, double price, Size size, boolean b) {
        super(name, price, size);
    }

    @Override
    public String getDescription() {
        return "A hot " + getName();
    }
}
