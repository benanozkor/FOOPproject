package food;

public class Desserts extends Food {

    @Override
    public void setFoodType(String foodType) {
        super.setFoodType("Desert");
    }

    public Desserts(){

    }



    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }


}
