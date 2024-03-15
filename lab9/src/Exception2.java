import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo();
    }

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        }
    }
}