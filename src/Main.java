import food.Buns;
import food.Cookies;
import food.Desserts;
import food.Food;

public class Main {
    public static void main(String[] args) {

        Desserts desserts = new Cookies();
        Desserts desserts1 = desserts;
        desserts1.welcome();



    }
}