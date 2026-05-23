import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Write your program here -- consider breaking the program into
        // multiple classes.
        UserInterface userInterface = new UserInterface(scanner, arrayList);
        userInterface.start();
    }
}
