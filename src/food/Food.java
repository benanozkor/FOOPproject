package food;

import betCafepackage.BetCafe;
import betCafepackage.CafeItem;

public abstract class Food extends CafeItem {
    private int calories;
    private String foodType;
    private boolean forVegans;
    private String foodContent;


    public Food(){

    }
    public Food(String productName, double price, int calories, String foodType, boolean forVegans, String foodContent){
        super(productName,price);
        this.calories= calories;
        this.foodType = foodType;
        this.forVegans = forVegans;
        this.foodContent = foodContent;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isForVegans() {
        return forVegans;
    }

    public void setForVegans(boolean forVegans) {
        this.forVegans = forVegans;
    }


    public String getFoodContent() {
        return foodContent;
    }

    public void setFoodContent(String foodContent) {
        this.foodContent = foodContent;
    }
}
