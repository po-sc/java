public class Exception1 {
    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        ex.exceptionDemo();
    }

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
