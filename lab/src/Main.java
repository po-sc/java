public class Main {
    public static void main(String[] args) {
        Dog labrador = new Labrador("Бобик");
        Dog bulldog = new Bulldog("Шарик");

        labrador.displayInfo();
        labrador.bark();

        bulldog.displayInfo();
        bulldog.bark();
    }
}

