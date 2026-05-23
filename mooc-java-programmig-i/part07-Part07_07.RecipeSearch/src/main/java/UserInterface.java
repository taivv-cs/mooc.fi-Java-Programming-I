import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private SearchEngine engine;

    public UserInterface(Scanner scanner, SearchEngine engine) {
        this.scanner = scanner;
        this.engine = engine;
    }

    public void start() {
        System.out.print("File to read: ");
        String url = scanner.nextLine();

        this.engine.loadRecipleFromFile(url);

        System.out.println("Command:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println(
            "find cooking time - searches recipes by cooking time"
        );
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                this.engine.printRecipe();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                ArrayList<Recipe> recipes = this.engine.searchWord(word);
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.parseInt(scanner.nextLine());
                System.out.println("Recipes");
                ArrayList<Recipe> recipes = this.engine.searchTime(time);
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes");
                ArrayList<Recipe> recipes = this.engine.searchRecipe(
                    ingredient
                );
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
