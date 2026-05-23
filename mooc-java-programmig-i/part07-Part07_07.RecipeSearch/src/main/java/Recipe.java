import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredient;

    public Recipe(String name, int time, ArrayList<String> ingredient) {
        this.name = name;
        this.time = time;
        this.ingredient = ingredient;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredient() {
        return this.ingredient;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
