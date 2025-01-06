package food;

public class Desserts extends Food {

    double sugarAmount;
    private String alias;  // Alias alanı eklendi

    // Alias Destekli Yapıcı Metod
    public Desserts(String productName, String alias, double productPrise, int calories, String foodType, boolean forVegans, String foodContent) {
        super(productName, alias, productPrise, calories, foodType, forVegans, foodContent);
        this.alias = alias;
    }

    // Eski Yapıcı Metod (Alias olmadan, geriye dönük uyumlu)
    public Desserts(String productName, double productPrise, int calories, String foodType, boolean forVegans, String foodContent) {
        super(productName, productPrise, calories, foodType, forVegans, foodContent);
        this.alias = "";  // Varsayılan olarak alias boş bırakılır
    }

    public Desserts() {
    }

    // Alias Getter
    public String getAlias() {
        return alias;
    }

    // Alias Setter
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
