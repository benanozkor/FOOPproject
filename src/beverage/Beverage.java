package beverage;

import betCafepackage.BetCafe;

public abstract class Beverage extends BetCafe {

    String name;
    int size;

    public Beverage(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    void hey() {
        System.out.println("hey beverage.Beverage");
    }
}
