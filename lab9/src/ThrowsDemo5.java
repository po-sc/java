public class ThrowsDemo5 {
    public static void main(String[] args) {
        ThrowsDemo5 demo = new ThrowsDemo5();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        // do something with the key
    }
}


////6.java
//
//        import java.util.Scanner;
//
//public class ThrowsDemo {
//    public static void main(String[] args) {
//        ThrowsDemo demo = new ThrowsDemo();
//        try {
//            demo.getKey();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void getKey() throws Exception {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter Key: ");
//        String key = myScanner.nextLine();
//        printDetails(key);
//    }
//
//    public void printDetails(String key) throws Exception {
//        if(key.equals("")) {
//            throw new Exception("Key set to empty string");
//        }
//        System.out.println("data for " + key);
//    }
//}
