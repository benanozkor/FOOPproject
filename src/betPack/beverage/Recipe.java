package betPack.beverage;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients;

    public Recipe(String... ingredients) {
        this.ingredients = new ArrayList<>();
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return String.join(", ", ingredients);
    }
}