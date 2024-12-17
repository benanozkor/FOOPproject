package betPack.beverage;
import betPack.BetCafe;

public abstract class Beverages extends BetCafe {
    private String name;
    private double price;
    private Size size;

    public Beverages(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public abstract String getDescription();

    public void display() {
        System.out.println("Beverage: " + name + ", Size: " + size + ", Price: $" + price);
    }
}

