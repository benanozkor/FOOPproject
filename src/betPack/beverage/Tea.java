package betPack.beverage;
class Tea extends Hot {

    public static final Tea GREEN_TEA = new Tea("Green Tea", 60, "Healthy green tea", new Recipe("Green tea leaves", "Hot water"));
    public static final Tea BLACK_TEA = new Tea("Black Tea", 50, "Traditional black tea", new Recipe("Black tea leaves", "Hot water"));
    public static final Tea HERBAL_TEA = new Tea("Herbal Tea", 70, "Relaxing herbal tea", new Recipe("Herbal mix", "Hot water"));

    private String description;
    private Recipe recipe;

    public Tea(String name, double price, String description, Recipe recipe) {
        super(name, price, Size.Small);
        this.description = description;
        this.recipe = recipe;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public static void displayAllTeas() {
        Tea[] teas = {GREEN_TEA, BLACK_TEA, HERBAL_TEA};
        for (Tea tea : teas) {
            System.out.println(tea.getName() + ": " + tea.getDescription());
            System.out.println("Recipe: " + tea.getRecipe());
            System.out.println();
        }
    }
}
