package beverage;

public class Hot extends Beverages {

    public Hot(String name, double price, Size size, boolean b) {
        super(name, price, size);
    }

    @Override
    public String getDescription() {
        return "A hot " + getName();
    }
}
