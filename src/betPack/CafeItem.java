package betPack;

public abstract class CafeItem {
    private String name;
    private double price;

    // Constructor
    public CafeItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods
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

    // Abstract method for displaying a description
    public abstract void display();

    // Abstract method for calculating price based on some parameters
    public abstract double calculatePrice();
}
