import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ManagerObservation managerObservation;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.managerObservation = new ManagerObservation();
    }

    public void start() {
        while (true) {
            System.out.print("? ");

            // Shutdown program
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scanner.nextLine();
                this.managerObservation.add(new Observation(name, nameInLatin));
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                Observation observation = managerObservation.searchName(name);
                if (observation != null) {
                    observation.increase();
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                managerObservation.printAll();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                Observation observation = managerObservation.searchName(name);
                if (observation != null) {
                    System.out.println(observation);
                } else {
                    System.out.println("Note a bird!");
                }
            }
        }
    }
}
