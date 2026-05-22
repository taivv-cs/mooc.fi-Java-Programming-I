import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchEngine {

    private ArrayList<Recipe> recipes;

    public SearchEngine() {
        this.recipes = new ArrayList<>();
    }

    public void loadRecipleFromFile(String url) {
        try (Scanner fileIO = new Scanner(Paths.get(url))) {
            while (fileIO.hasNextLine()) {
                String name = fileIO.nextLine();
                int time = Integer.parseInt(fileIO.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (fileIO.hasNextLine()) {
                    String ingredient = fileIO.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                this.recipes.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printRecipe() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public ArrayList<Recipe> searchWord(String word) {
        ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                result.add(recipe);
            }
        }

        return result;
    }

    public ArrayList<Recipe> searchTime(int maxTime) {
        ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                result.add(recipe);
            }
        }

        return result;
    }

    public ArrayList<Recipe> searchRecipe(String ingredient) {
        ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : recipes) {
            for (String i : recipe.getIngredient()) {
                if (i.equals(ingredient)) {
                    result.add(recipe);
                    break;
                }
            }
        }

        return result;
    }
}
