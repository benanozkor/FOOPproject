package food;

import betCafepackage.BetCafe;

public abstract class Food extends BetCafe {

    private String productName;
    private double productPrise;
    private int calories;
    private String foodType;
    private boolean forVegans;
    private String foodContent;


    public Food(){

    }
    public Food(String productName, double productPrise, int calories, String foodType, boolean forVegans, String foodContent){
        this.productName = productName;
        this.productPrise = productPrise;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrise() {
        return productPrise;
    }

    public void setProductPrise(double productPrise) {
        this.productPrise = productPrise;
    }

    public String getFoodContent() {
        return foodContent;
    }

    public void setFoodContent(String foodContent) {
        this.foodContent = foodContent;
    }
}
