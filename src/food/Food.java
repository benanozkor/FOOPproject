package food;

import betCafepackage.BetCafe;

public abstract class Food extends BetCafe {

    private int calories;
    private String foodType;

    private boolean forVegans;

    public Food(){

    }
    public Food(int calories, String foodType, boolean forVegans){
        this.calories= calories;
        this.foodType = foodType;
        this.forVegans = forVegans;
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
}
