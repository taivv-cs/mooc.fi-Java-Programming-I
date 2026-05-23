import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int sum = 0,
            countNumber = 0,
            countEven = 0;
        System.out.println("Give numbers:");
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum += n;
                ++countNumber;
                if (n % 2 == 0) {
                    ++countEven;
                }
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countNumber);
        System.out.println("Average: " + (1.0 * sum) / countNumber);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + (countNumber - countEven));
    }
}
