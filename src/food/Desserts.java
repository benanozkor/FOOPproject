package food;

public class Desserts extends Food {

    double sugarAmount;


    @Override
    public void setFoodType(String foodType) {
        super.setFoodType("Desert");
    }

    public Desserts(int calories, String foodType, String productName, boolean forVegans, String description){
        super(calories,foodType, productName,forVegans, description);

    }
    public Desserts(){}



    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }


}
