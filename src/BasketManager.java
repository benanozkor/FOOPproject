import food.Food;

import java.util.HashMap;

public class BasketManager {
    private final HashMap<Food, Integer> basket;

    public BasketManager(){
        basket = new HashMap<>();
    }

    // Adds a product to the Basket
    public void addToBasket(Food food){
        if (food == null) {
            System.out.println("The selected product is not available in the menu. ");
            return;
        }
        basket.put(food, basket.getOrDefault(food,0) + 1);
        System.out.println(food.getProductName() + " added to the basket ");
    }


    // Displays the contents of the Basket
    public void showBasket(){
        if(basket.isEmpty()) {
            System.out.println("Your basket is empty. ");
            return;
        }
        System.out.println("Basket Contents: ");
        for (Food food: basket.keySet()) {
            System.out.println(food.getProductName() + " - Quantity: " + basket.get(food));
        }
    }


}
