import betCafepackage.CafeItem;
import beverage.Beverage;
import food.Food;

import java.util.HashMap;

public class BasketManager {
    private final HashMap<CafeItem, Integer> basket;

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

    public void addBeverageToBasket(Beverage beverage){
        if (beverage == null) {
            System.out.println("The selected product is not available in the menu. ");
            return;
        }
        basket.put(beverage, basket.getOrDefault(beverage,0) + 1);
        System.out.println(beverage.getName() + " added to the basket");
    }


    // Displays the contents of the Basket
    public void showBasket(){
        if(basket.isEmpty()) {
            System.out.println("Your basket is empty. ");
            return;
        }
        System.out.println("Basket Contents: ");
        for (CafeItem cafeItem: basket.keySet()) {
            System.out.println(cafeItem.getProductName() + " - Quantity: " + basket.get(cafeItem));
        }
    }

    public void removeItemBasket(CafeItem cafeItem){
        basket.remove(cafeItem,basket.get(cafeItem)+1);
        System.out.println(basket.get(cafeItem) + "is removed from the basket.");
    }


}
