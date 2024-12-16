package beverage;

import betCafepackage.BetCafe;

public abstract class Beverage extends BetCafe {
    private int name;
    private double price;
    public String size;
    public String recipe;

    public Beverage() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) { this.size = size; }

    public String getRecipe() { return recipe; }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }


}