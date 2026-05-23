public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money first = new Money(7, 50);
        Money second = new Money(1, 60);
        System.out.println(first.minus(second));
    }
}
