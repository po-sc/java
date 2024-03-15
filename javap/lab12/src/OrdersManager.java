
public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();

    void add(Order order, int tableNumber);

    void addItem(MenuItem item, int tableNumber);

    int freeTableNumber();

    int[] freeTableNumbers();

    Order getOrder(int tableNumber);

    void remove(int tableNumber);

    int remove(Order order);

    int removeAll(Order order);

    // Method to add an order to the manager
    boolean add(Order order);

    // Method to remove the first order from the manager
    Order remove();

    // Method to get the first order in the manager
    Order order();
}
