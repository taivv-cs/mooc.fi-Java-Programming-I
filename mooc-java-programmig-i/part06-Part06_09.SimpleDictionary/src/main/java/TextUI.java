import java.util.Scanner;

public class TextUI {
  private SimpleDictionary simpleDictionary;
  private Scanner scanner;

  public TextUI(Scanner scanner, SimpleDictionary dictionary) {
    this.scanner = scanner;
    this.simpleDictionary = dictionary;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scanner.nextLine();
      if (command.equals("add")) {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        simpleDictionary.add(word, translation);
      } else if (command.equals("end")) {
        System.out.println("Bye bye!");
        break;
      } else if (command.equals("search")) {
        System.out.print("To be translated: ");
        String search = scanner.nextLine();
        if (simpleDictionary.translate(search) == null) {
          System.out.println("Word " + search + " was not found");
        } else {
          System.out.println("Translation: " + simpleDictionary.translate(search));
        }
      } else {
        System.out.println("Unknown command");
      }
    }
  }
}
