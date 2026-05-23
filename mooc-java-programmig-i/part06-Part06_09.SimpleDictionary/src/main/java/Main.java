import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Try out how the different parts of the program work together
    // here
    Scanner scanner = new Scanner(System.in);
    SimpleDictionary dictionary = new SimpleDictionary();

    TextUI textUI = new TextUI(scanner, dictionary);
    textUI.start();
    System.out.println(dictionary.translate("pike"));

    // [ERROR] Failures:
    // [ERROR]   TextUITest.addCommandWorks:135 Make sure that the text UI stops when the user
    // enters the command 'end'.
    // [ERROR]   TextUITest.addCommandWorksWithManyPairsOfWords:153 Make sure that the text UI stops
    // when the user enters the command 'end'.
    // [ERROR]   TextUITest.endingCommandOfTextUIWorks:108 Make sure the text UI is stopped when the
    // user enters the command 'end'. Are you certain you are using the Scanner that was passed as a
    // constructor
    // parameter?
    // [ERROR]   TextUITest.searchCommandDoesNotReturnNull:218 Make sure that the text UI stops when
    // the user enters the command 'end'.
    // [ERROR]   TextUITest.searchCommandWorksWithMultiplePairsOfWords:194 Make sure that the text
    // UI stops when the u
    // ser enters the command 'end'.
    // [ERROR]   TextUITest.searchCommandWorksWithOnePairOfWords:175 Make sure that the text UI
    // stops when the user en
    // ters the command 'end'.
    // [ERROR]   TextUITest.startMethod:97 NoSuchElementException: No line found, in call start().
    // The error was caused by the following code
    //  TextUI t = new TextUI(new Scanner(System.in), new SimpleDictionary());
    // t.start();
    // [ERROR]   TextUITest.textUIEndCommandWorksEvenWithDifferentInput:121 Make sure the text UI
    // stops when the user
    // enters the command 'end'.
  }
}
