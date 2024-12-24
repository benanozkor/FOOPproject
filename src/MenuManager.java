import food.Desserts;
import food.Food;
import food.Salty;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuManager {
    private HashMap<String, Food> menu;
    private ArrayList<String> orderedNames; //List to map to food names
    public MenuManager(){
        menu = new HashMap<>();
        orderedNames = new ArrayList<>();
        preloadMenu();
    }
    private void preloadMenu(){
        addMenuItem( new Desserts("Chocolate Cookie",70, 455,"Dessert",true,"chocolate"));
        addMenuItem( new Desserts("Christmas Cookie",70, 455,"Dessert",true,"chocolate"));
        addMenuItem( new Desserts("Almond Cookie",70,590,"Dessert", true,"Almond"));
        addMenuItem( new Desserts("Chocolate Layer Cake",100,600,"Dessert", true,"chocolate"));
        addMenuItem( new Desserts("Red-Velvet Cake",100, 735,"Dessert",true,"chocolate"));
        addMenuItem( new Desserts("Strawberry Cake",100, 585,"Dessert",true,"chocolate"));
        addMenuItem( new Desserts("Cheesecake",100,590,"Dessert", false,"Almond"));
        addMenuItem( new Desserts("Espresso Brownie",80,600,"Dessert", true,"chocolate"));
        addMenuItem( new Desserts("Triple Chocolate",80,590,"Dessert", false,"Almond"));
        addMenuItem( new Desserts("Frosted Brownie",80,600,"Dessert", true,"chocolate"));
        addMenuItem( new Salty("Smoked Chicken Sandwich",120,756,"Salty",false,"chicken"));
        addMenuItem( new Salty("Ham and Cheese Sandwich",150,726,"Salty",false,"Ham"));
        addMenuItem( new Salty("Vegetable Sandwich",80,308,"Salty",true,"vegetables"));
        addMenuItem( new Salty("Grilled Meat Sandwich",150,756,"Salty",false,"meat"));
        addMenuItem( new Salty("Egged Sausage Sandwich",120,576,"Salty",false,"eggs"));
        addMenuItem( new Salty("Cheese Borek",70,345,"Salty",false,"cheese"));
        addMenuItem( new Salty("Meat Borek",100,436,"Salty",false,"chicken"));
        addMenuItem( new Salty("Potato Borek",70,336,"Salty",true,"potato"));
    }
    private void addMenuItem(Food food) {
        menu.put(food.getProductName(), food);
        orderedNames.add(food.getProductName());  // maintain orders for numbers
    }
    public HashMap<String, Food> getMenu(){
        return menu;
    }
    public Food getProduct(String name){
        return menu.get(name);
    }
    public Food getProductByNumber(int number){
        if(number < 1 || number > orderedNames.size()){
            System.out.println("Invalid product number.");
            return null;
        }
        String name = orderedNames.get(number - 1);
        return menu.get(name);
    }

}


