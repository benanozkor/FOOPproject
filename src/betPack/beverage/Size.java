package betPack.beverage;

public class Size {
    private String name;

    public static final Size Small = new Size("Small");
    public static final Size Medium = new Size ("Medium");
    public static final Size Large = new Size ("Large");

    private Size(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
