import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int countPositiveNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else if (num > 0) {
                ++countPositiveNumbers;
                sum += num;
            }
        }
        if (countPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((1.0 * sum) / countPositiveNumbers);
        }
    }
}
