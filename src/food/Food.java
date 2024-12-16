package food;

import betCafepackage.BetCafe;

public abstract class Food extends BetCafe {

    private String foodName;
    private String recipe;
    private int calorie;

    public Food(){

    }

    String getFoodName(){
        return foodName;
    }
    void setFoodName(String foodName){
        this.foodName=foodName;
    }


    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }





    void hey() {
        System.out.println("hey food.Food");
    }
}
