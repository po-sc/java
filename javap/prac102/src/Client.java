public class Client {
    private Chair chair;

    public void sitOnChair() {
        if (chair != null) {
            chair.sit();
        } else {
            System.out.println("No chair has been set to sit on.");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        // Client uses a Victorian Chair
        client.setChair(factory.createVictorianChair());
        client.sitOnChair();

        // Client uses a Magic Chair
        client.setChair(factory.createMagicChair());
        client.sitOnChair();

        // Client uses a Functional Chair
        client.setChair(factory.createFunctionalChair());
        client.sitOnChair();
    }
}
