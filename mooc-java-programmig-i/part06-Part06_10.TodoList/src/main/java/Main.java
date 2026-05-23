import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Here you can try out the combined functionality of your classes
    TodoList todoList = new TodoList();
    Scanner scanner = new Scanner(System.in);
    UserInterface userInterface = new UserInterface(todoList, scanner);
    userInterface.start();
  }
}

// [ERROR] Failures:
// [ERROR]   TodoListTest.testCommandAdd:163 The constructor UserInterface(TodoList, Scanner) is
// missing.
// [ERROR]   TodoListTest.testCommandList:198 The constructor UserInterface(TodoList, Scanner) is
// missing.
// [ERROR]   TodoListTest.testCommandRemove:228 The constructor UserInterface(TodoList, Scanner) is
// missing.
// [ERROR]   TodoListTest.testCommandRemove2:262 The constructor UserInterface(TodoList, Scanner) is
// missing.
// [ERROR]   TodoListTest.testMethodStop:145 The constructor UserInterface(TodoList, Scanner) is
// missing.
// [ERROR]   TodoListTest.theClassUserInterfaceHasConstructorTakingTwoParameters:117 The constructor
// UserInterface
// (TodoList, Scanner) is missing.
// [ERROR]   TodoListTest.theMethodsOfTodoListWorkCorrectly:82->theOutpuContains:277 Expected the
// output to contai
// n the string:
