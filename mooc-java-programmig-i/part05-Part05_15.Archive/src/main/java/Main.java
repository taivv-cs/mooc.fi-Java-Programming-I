import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      ArrayList<Archive> items = new ArrayList<>();

      while (true) {

        System.out.println("Indentifier? (empty will stop)");
        String indentifier = scanner.nextLine();
        if (indentifier.isEmpty()) {
          break;
        }
        System.out.println("Name? (empty will stop)");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
          break;
        }

        Archive archive = new Archive(indentifier, name);
        if (items.contains(archive)) {
          continue;
        }
        items.add(archive);
      }

      System.out.println("==Items==");
      for (Archive i : items) {
        System.out.println(i);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
