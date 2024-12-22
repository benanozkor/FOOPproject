package food;

import betCafepackage.BetCafe;

public abstract class Food extends BetCafe {

    private int calories;
    private String foodType;
    private String productName;

    private boolean forVegans;
    private String description;


    public Food(){

    }
    public Food(int calories, String foodType, String productName, boolean forVegans, String description){
        this.calories= calories;
        this.foodType = foodType;
        this.productName = productName;
        this.forVegans = forVegans;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
