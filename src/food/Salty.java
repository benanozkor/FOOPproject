package food;

public class Salty extends Food {

    @Override
    public void setFoodType(String foodType) {
        super.setFoodType("Salty");
    }

    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }
}
