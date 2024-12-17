package betPack.beverage;

public class Hot extends Beverages {

    public Hot(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public String getDescription() {
        return "A hot " + getName();
    }
}
