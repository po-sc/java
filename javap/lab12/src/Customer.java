
public final class Customer {
    private final String firstName;
    private final String secondName;
    private final int age;
    private final Address address;

    public static final Customer MATURE_UNKNOWN_CUSTOMER; // инициализация;
    public static final Customer NOT_MATURE_UNKNOWN_CUSTOMER; // инициализация;

    static {
        // Initialize MATURE_UNKNOWN_CUSTOMER and NOT_MATURE_UNKNOWN_CUSTOMER here
        MATURE_UNKNOWN_CUSTOMER = new Customer("Mature", "Unknown", 0, Address.EMPTY_ADDRESS);
        NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("Not Mature", "Unknown", 0, Address.EMPTY_ADDRESS);
    }

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    // Геттеры
    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public int getAge() { return age; }
    public Address getAddress() { return address; }
}
