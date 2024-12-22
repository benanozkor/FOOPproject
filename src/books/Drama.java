package books;


import java.util.HashMap;
import java.util.Map;

public class Drama extends Books {

    Map<String, Integer> map = new HashMap<>();


    @Override
    public void welcome(){
        System.out.println("Welcome to Bet Cafe");
    }
}
