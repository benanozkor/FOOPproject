package beverage;

import betCafepackage.CafeItem;

public abstract class Beverage extends CafeItem {

    private Size size;
    private final double basePrice;  // Baz fiyat başlangıçta belirlenir ve değiştirilemez.
    private int quantity = 1;  // Başlangıçta 1 adet içecek.

    public Beverage(String productName, double price, Size size) {
        super(productName, price * size.getPriceMultiplier());  // Fiyat, seçilen boyutla baştan hesaplanır.
        this.size = size;
        this.basePrice = price;  // Base price sabit tutulur.
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return super.getProductName();
    }

    public void setName(String name) {
        super.setProductName(name);
    }

    public double getPrice() {
        return super.getPrice();  // Her zaman güncel fiyat döndürülür.
    }

    public Size getSize() {
        return size;
    }

    public Beverage createWithNewSize(Size newSize) {
        return new Beverage(this.getName(), this.basePrice, newSize) {
            @Override
            public String getDescription() {
                return "Customized " + getName();
            }
        };
    }

    public void addToBasket() {
        this.quantity++;
    }

    public double calculateTotalPrice() {
        return getPrice() * quantity;  // Her seferinde toplam fiyat hesaplanır.
    }

    public abstract String getDescription();

    public void display() {
        System.out.println("Beverage: " + getProductName() + ", Size: " + size + ", Quantity: " + quantity + ", Total Price: TL" + String.format("%.2f", calculateTotalPrice()));
    }
}
