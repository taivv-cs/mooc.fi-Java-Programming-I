import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchEngine engine = new SearchEngine();
        UserInterface userInterface = new UserInterface(scanner, engine);
        userInterface.start();
    }
}
