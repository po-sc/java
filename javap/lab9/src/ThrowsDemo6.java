
        import java.util.Scanner;

public class ThrowsDemo6 {
    public static void main(String[] args) {
        ThrowsDemo6 demo = new ThrowsDemo6();
        try {
            demo.getKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
