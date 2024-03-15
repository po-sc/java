import java.util.Objects;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    // Constructor
    public InternetOrdersManager() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int totalQuantity = 0;
        QueueNode current = head;

        while (current != null) {
            totalQuantity += current.value.itemQuantity(itemName);
            current = current.next;
        }

        return totalQuantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int totalQuantity = 0;
        QueueNode current = head;

        while (current != null) {
            totalQuantity += current.value.itemQuantity(item);
            current = current.next;
        }

        return totalQuantity;
    }

    @Override
    public Order[] getOrders() {
        Order[] ordersArray = new Order[size];
        QueueNode current = head;
        int index = 0;

        while (current != null) {
            ordersArray[index++] = current.value;
            current = current.next;
        }

        return ordersArray;
    }

    @Override
    public int ordersCostSummary() {
        int totalCost = 0;
        QueueNode current = head;

        while (current != null) {
            totalCost += current.value.costTotal();
            current = current.next;
        }

        return totalCost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    @Override
    public boolean add(Order order) {
        QueueNode newNode = new QueueNode(order);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
        return true;
    }

    @Override
    public Order remove() {
        if (head == null) {
            return null;
        }

        Order removedOrder = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return removedOrder;
    }

    @Override
    public Order order() {
        if (head == null) {
            return null;
        }

        return head.value;
    }

    @Override
    public void add(Order order, int tableNumber) {
        order.setTableNumber(tableNumber);
        add(order);
    }

    @Override
    public void addItem(MenuItem item, int tableNumber) {

    }

    @Override
    public int freeTableNumber() {
        return 0;
    }

    @Override
    public int[] freeTableNumbers() {
        return new int[0];
    }

    @Override
    public Order getOrder(int tableNumber) {
        return null;
    }

    @Override
    public void remove(int tableNumber) {

    }

    @Override
    public int remove(Order order) {
        return 0;
    }

    @Override
    public int removeAll(Order order) {
        return 0;
    }

    private static class QueueNode {
        public QueueNode next;
        public Order value;

        public QueueNode(Order value) {
            this.value = value;
        }
    }
}
