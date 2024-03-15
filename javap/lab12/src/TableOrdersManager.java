import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;

    // Constructor
    public TableOrdersManager() {
        this.orders = new Order[10]; // Initial capacity, you may adjust as needed
    }

    @Override
    public int itemsQuantity(String itemName) {
        int totalQuantity = 0;
        for (Order order : orders) {
            if (order != null) {
                totalQuantity += order.itemQuantity(itemName);
            }
        }
        return totalQuantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int totalQuantity = 0;
        for (Order order : orders) {
            if (order != null) {
                totalQuantity += order.itemQuantity(item);
            }
        }
        return totalQuantity;
    }

    @Override
    public Order[] getOrders() {
        // Return a copy of the orders array without null elements
        return Arrays.stream(orders)
                .filter(Objects::nonNull)
                .toArray(Order[]::new);
    }

    @Override
    public int ordersCostSummary() {
        int totalCost = 0;
        for (Order order : orders) {
            if (order != null) {
                totalCost += order.costTotal();
            }
        }
        return totalCost;
    }

    @Override
    public int ordersQuantity() {
        long nonNullOrders = Arrays.stream(orders).filter(Objects::nonNull).count();
        return (int) nonNullOrders;
    }

    @Override
    public void add(Order order, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length) {
            orders[tableNumber] = order;
        }
    }

    @Override
    public void addItem(MenuItem item, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length && orders[tableNumber] != null) {
            orders[tableNumber].add(item);
        }
    }

    @Override
    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1; // No free table found
    }

    @Override
    public int[] freeTableNumbers() {
        List<Integer> freeTables = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                freeTables.add(i);
            }
        }
        return freeTables.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public Order getOrder(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length) {
            return orders[tableNumber];
        }
        return null; // Invalid table number
    }

    @Override
    public void remove(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length) {
            orders[tableNumber] = null;
        }
    }

    @Override
    public int remove(Order order) {
        int removedCount = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                removedCount++;
            }
        }
        return removedCount;
    }

    @Override
    public int removeAll(Order order) {
        int removedCount = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                removedCount++;
            }
        }
        return removedCount;
    }

    @Override
    public boolean add(Order order) {
        return false;
    }

    @Override
    public Order remove() {
        return null;
    }

    @Override
    public Order order() {
        return null;
    }
}
