package beverage;

public class CupSelector {

    public static String selectCup(boolean isHot) {
        if (isHot) {
            return "Cardboard Cup";
        } else {
            return "Plastic Cup";
        }
    }
    public static String selectCupSize(Size size){
        return size.getName();
    }
}