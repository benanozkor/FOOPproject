package food;

public class Desserts extends Food {

    double sugarAmount;


    public Desserts(String productName, double productPrise, int calories, String foodType, boolean forVegans, String foodContent){
        super(productName,productPrise,calories,foodType,forVegans,foodContent);

    }
    public Desserts(){}


}
