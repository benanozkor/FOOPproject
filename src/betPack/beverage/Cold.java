package betPack.beverage;

public class Cold extends Beverages{

    private boolean isIced;

    public Cold(String name, double price, Size size, boolean isIced) {
        super(name, price, size);
        this.isIced = isIced;
    }

    public boolean isIced() {
        return isIced;
    }

    public void setIced(boolean iced) {
        isIced = iced;
    }

    @Override
    public String getDescription() {
        return isIced? "A refreshing iced " + getName() : "A cold" + getName();
    }
}
