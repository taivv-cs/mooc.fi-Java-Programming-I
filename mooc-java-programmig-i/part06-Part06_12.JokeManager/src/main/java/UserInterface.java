import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");
        while (true) {
            menu();
            String option = scanner.nextLine();
            if (option.equals("X")) {
                break;
            }
            if (option.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if (option.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokeManager.drawJoke());
            } else if (option.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }

    private void menu() {
        System.out.println(
            "Command: \n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop\n"
        );
    }
}
