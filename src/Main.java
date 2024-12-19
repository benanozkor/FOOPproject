import food.Buns;
import food.Cookies;
import food.Desserts;
import food.Food;

public class Main {
    public static void main(String[] args) {

        Desserts desserts = new Cookies();
        Desserts desserts1 = desserts;
        Desserts desserts2 = new Desserts(234,"salty", false);
        System.out.println(desserts2.getFoodType());
        desserts1.welcome();



    }
}