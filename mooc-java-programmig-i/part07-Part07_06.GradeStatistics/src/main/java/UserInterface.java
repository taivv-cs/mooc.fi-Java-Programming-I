import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Points points;

    public UserInterface(Scanner scanner, ArrayList<Integer> arrayList) {
        this.scanner = scanner;
        this.points = new Points();
    }

    public void start() {
        System.out.println("Enter point total, -1 stops:");
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("-1")) {
                break;
            }

            int num = parseStrToInt(command);
            if (points.isValid(num)) {
                points.addPoint(num);
            }
        }

        System.out.println("Point average (all): " + points.averageAll());
        if (points.averagePassing() < 50.0f) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println(
                "Point average (passing): " + points.averagePassing()
            );
        }

        if (points.passPercentage() < 50.0f) {
            System.out.println("Pass percentage: " + points.passPercentage());
        } else {
            System.out.println("Pass percentage: " + points.passPercentage());
        }

        points.showGradeDistribution();
    }

    private int parseStrToInt(String numberAsString) {
        return Integer.valueOf(numberAsString);
    }
}
