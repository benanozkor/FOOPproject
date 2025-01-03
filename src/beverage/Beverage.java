package beverage;

import betCafepackage.CafeItem;

public abstract class Beverage extends CafeItem {

    private Size size;

    public Beverage(String productName, double price, Size size) {
        super(productName,price);
        this.size = size;
    }

    public String getName() {
        return super.getProductName();
    }
    public void setName(String name) {
        super.setProductName(name);
    }

    public double getPrice() {
        return super.getPrice();
    }
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public abstract String getDescription();

    public void display() {
        System.out.println("Beverage: " + getProductName() + ", Size: " + size + ", Price: $" + getPrice());
    }
}
