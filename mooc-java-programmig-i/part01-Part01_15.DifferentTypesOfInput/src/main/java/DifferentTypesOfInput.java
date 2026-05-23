import java.util.Scanner;

public class DifferentTypesOfInput {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Write your program here
    System.out.println("Give a string:");
    String str = scan.nextLine();
    System.out.println("Give an integer:");
    int number = Integer.parseInt(scan.nextLine());
    System.out.println("Give a double:");
    double floatingPoint = Double.parseDouble(scan.nextLine());
    System.out.println("Give a boolean:");
    boolean isTrue = Boolean.parseBoolean(scan.nextLine());
    System.out.println("You gave the string " + str);
    System.out.println("You gave the integer " + number);
    System.out.println("You gave the double " + floatingPoint);
    System.out.println("You gave the boolean " + isTrue);
  }
}
