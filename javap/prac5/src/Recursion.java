public class Recursion {

    public static void recursion(int N) {
        if (N < 10) {
            System.out.print(N + "\t");
        } else {
            recursion(N/10);
            System.out.print(N % 10 + "\t");

        }
    }

    public static void main (String[]args) {
        recursion(1234567890);
        }
}