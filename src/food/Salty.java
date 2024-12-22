package food;

public class Salty extends Food {


    public Salty(String productName, double productPrise, int calories, String foodType, boolean forVegans, String foodContent){
        super(productName,productPrise,calories,foodType,forVegans,foodContent);
    }

    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }
}
