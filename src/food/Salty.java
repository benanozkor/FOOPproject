package food;

public class Salty extends Food {

    private String alias;  // Alias alanı eklendi

    // Alias Destekli Yapıcı Metod
    public Salty(String productName, String alias, double productPrise, int calories, String foodType, boolean forVegans, String foodContent) {
        super(productName, alias, productPrise, calories, foodType, forVegans, foodContent);
        this.alias = alias;
    }

    // Eski Yapıcı Metod (Alias olmadan, geriye dönük uyumlu)
    public Salty(String productName, double productPrise, int calories, String foodType, boolean forVegans, String foodContent) {
        super(productName, productPrise, calories, foodType, forVegans, foodContent);
        this.alias = "";  // Varsayılan olarak alias boş bırakılır
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
