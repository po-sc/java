import java.util.Scanner;

public class ThrowsDemo7 {
    public static void main(String[] args) {
        ThrowsDemo7 demo = new ThrowsDemo7();
        try {
            demo.getKey();
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key: ");
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        System.out.println("data for " + key);
    }
}

