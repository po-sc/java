import java.util.Arrays;

public class RestaurantApp {
    public static void main(String[] args) {
        // Create some sample menu items
        MenuItem menuItem1 = new MenuItem(10, "Spageti", "Balonese");
        MenuItem menuItem2 = new MenuItem(15, "Pizza", "Peperoni");

        // Create a customer
        Address customerAddress = new Address("Moscow", 142190, "Troickiy bulvar", 7, 'A', 79);
        Customer customer = new Customer("Nikita", "Smolnikov", 25, customerAddress);

        // Create instances of Drink for specified drink types
        Drink beer = new Drink(5, "Beer", "Refreshing alcoholic beverage", 5.0, DrinkTypeEnum.BEER);
        Drink wine = new Drink(12, "Wine", "Red or white wine", 12.5, DrinkTypeEnum.WINE);

        // Create an order and add items (including drinks)
        ConcreteOrder order1 = new ConcreteOrder();
        order1.setCustomer(customer);
        order1.add(menuItem1);
        order1.add(menuItem2);
        order1.add(beer);  // Add a beer to the order
        order1.add(wine);  // Add a wine to the order

        // Create an internet orders manager and add the order
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        internetOrdersManager.add(order1);

        // Display information
        displayOrderInformation(order1);
        displayInternetOrdersSummary(internetOrdersManager);
    }

    // Helper method to display order information
    private static void displayOrderInformation(Order order) {
        System.out.println("Order Information:");
        System.out.println("Customer: " + order.getCustomer().getFirstName() + " " + order.getCustomer().getSecondName());
        System.out.println("Items: " + String.join(", ", order.itemsNames()));
        System.out.println("Total Cost: $" + order.costTotal());
        System.out.println();
    }

    // Helper method to display internet orders summary
    private static void displayInternetOrdersSummary(InternetOrdersManager internetOrdersManager) {
        System.out.println("Internet Orders Summary:");
        System.out.println("Total Orders: " + internetOrdersManager.ordersQuantity());
        System.out.println("Total Cost: $" + internetOrdersManager.ordersCostSummary());
    }
}
