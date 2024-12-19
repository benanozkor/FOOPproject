package food;

public class Desserts extends Food {


    @Override
    public void setFoodType(String foodType) {
        super.setFoodType("Desert");
    }

    public Desserts(int calories, String foodType, boolean forVegans){
        super(calories,foodType, forVegans);

    }
    public Desserts(){}



    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }


}
