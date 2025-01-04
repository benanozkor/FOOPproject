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
        if (beverage != null) {
            basket.put(beverage, basket.getOrDefault(beverage, 0) + 1);
            System.out.println(beverage.getName() + " added to the basket");
            System.out.println("Choose size of your beverage: Small, Medium, Large");
        } else {
            System.out.println("The selected product is not available in the menu. ");

        }
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
        System.out.println(basket.get(cafeItem.getProductName()) + "is removed from the basket.");
    }

    public CafeItem getItemFromBasket(String name){
        for (CafeItem cafeItem : basket.keySet()){
            if (cafeItem.getProductName().equalsIgnoreCase(name)){
                return cafeItem;
            }
        }
        System.out.println("Product not found in basket");
        return null;
    }

    public double calculateTotalCafe(){
        double total = 0.0;
        for (CafeItem cafeItem : basket.keySet()){
            total += cafeItem.getPrice() * basket.get(cafeItem);
        }
        return total;
    }

    public void makePayment(double payment, double total){
        if (payment < total){
            System.out.println("Insufficient funds! Please type total.");
        } else if (payment > total) {
            System.out.println("Payment successful! Your money back : " + (payment - total));
        } else if (total == 0.0){
            System.out.println("Your basket is empty!");
        } else if (total == payment) {
            System.out.println("Payment successful!");
        }
    }




}
