import java.util.List;
import java.util.ArrayList;

public interface Order {
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
    void setTableNumber(int tableNumber);
    int getTableNumber();
}

class ConcreteOrder implements Order {
    private List<MenuItem> items;
    private Customer customer;
    private int tableNumber;

    public ConcreteOrder() {
        this.items = new ArrayList<>();
        this.customer = null;
        this.tableNumber = -1;
    }

    @Override
    public boolean add(MenuItem item) {
        return items.add(item);
    }

    @Override
    public String[] itemsNames() {
        return items.stream().map(MenuItem::getName).toArray(String[]::new);
    }

    @Override
    public int itemsQuantity() {
        return items.size();
    }

    @Override
    public int itemQuantity(String itemName) {
        return (int) items.stream().filter(item -> item.getName().equals(itemName)).count();
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return (int) items.stream().filter(item::equals).count();
    }

    @Override
    public MenuItem[] getItems() {
        return items.toArray(new MenuItem[0]);
    }

    @Override
    public boolean remove(String itemName) {
        return items.removeIf(item -> item.getName().equals(itemName));
    }

    @Override
    public boolean remove(MenuItem item) {
        return items.remove(item);
    }

    @Override
    public int removeAll(String itemName) {
        long countBeforeRemoval = items.stream().filter(item -> item.getName().equals(itemName)).count();
        items.removeIf(item -> item.getName().equals(itemName));
        long countAfterRemoval = items.stream().filter(item -> item.getName().equals(itemName)).count();
        return (int) (countBeforeRemoval - countAfterRemoval);
    }

    @Override
    public int removeAll(MenuItem item) {
        long countBeforeRemoval = items.stream().filter(item::equals).count();
        items.removeIf(item::equals);
        long countAfterRemoval = items.stream().filter(item::equals).count();
        return (int) (countBeforeRemoval - countAfterRemoval);
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        return items.stream()
                .sorted((item1, item2) -> Integer.compare(item2.getCost(), item1.getCost()))
                .toArray(MenuItem[]::new);
    }

    @Override
    public int costTotal() {
        return items.stream().mapToInt(MenuItem::getCost).sum();
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public int getTableNumber() {
        return tableNumber;
    }
}
