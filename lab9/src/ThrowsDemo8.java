import java.util.Scanner;

public class ThrowsDemo8 {
    public static void main(String[] args) {
        ThrowsDemo8 demo = new ThrowsDemo8();
        demo.getKey();
    }

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter Key: ");
                String key = myScanner.nextLine();
                printDetails(key);
                validInput = true;
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        System.out.println("data for " + key);
    }
}
