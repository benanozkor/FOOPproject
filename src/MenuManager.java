import food.Desserts;
import food.Food;
import food.Salty;
import java.util.HashMap;

public class MenuManager {
    private HashMap<String, Food> menu;
    public MenuManager(){
        menu = new HashMap<>();
        preloadMenu();
    }
    private void preloadMenu(){
        menu.put("Cookie", new Desserts("Cookie",240.0, 455,"Dessert",true,"chocolate"));
        menu.put("Cake", new Desserts("Cake",200.0, 455,"Dessert",true,"chocolate"));
        menu.put("Sandwitch", new Salty("Sandwitch",100,590,"Salty", false,"meat"));
    }
    public HashMap<String, Food> getMenu(){
        return menu;
    }
    public Food getProduct(String name){
        return menu.get(name);
    }
}
