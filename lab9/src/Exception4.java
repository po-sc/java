import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        Exception4 ex = new Exception4();
        ex.exceptionDemo();
    }

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}