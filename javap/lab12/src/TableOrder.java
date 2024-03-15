import java.util.Arrays;

public abstract class TableOrder implements Order {
    private int size;
    private MenuItem[] items;
    private Customer customer; // Added field to store the customer

    // Constructor
    public TableOrder() {
        this.size = 0;
        this.items = new MenuItem[10]; // Initial capacity, you may adjust as needed
        this.customer = null;
    }

    @Override
    public boolean add(MenuItem item) {
        if (size == items.length) {
            // If the array is full, double its capacity
            items = Arrays.copyOf(items, size * 2);
        }

        // Add the item to the order
        items[size++] = item;
        return true;
    }

    @Override
    public String[] itemsNames() {
        if (size == 0) {
            return new String[0]; // Return an empty array if there are no items
        }

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }

        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        return Arrays.copyOf(items, size);
    }

    @Override
    public boolean remove(String itemName) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            System.arraycopy(items, indexToRemove + 1, items, indexToRemove, size - indexToRemove - 1);
            items[--size] = null;
            return true;
        } else {
            return false; // Item not found
        }
    }

    @Override
    public boolean remove(MenuItem item) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            System.arraycopy(items, indexToRemove + 1, items, indexToRemove, size - indexToRemove - 1);
            items[--size] = null;
            return true;
        } else {
            return false; // Item not found
        }
    }

    @Override
    public int removeAll(String itemName) {
        int removedCount = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                items[--size] = null;
                removedCount++;
                i--; // Recheck the current index after removal
            }
        }
        return removedCount;
    }

    @Override
    public int removeAll(MenuItem item) {
        int removedCount = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                items[--size] = null;
                removedCount++;
                i--; // Recheck the current index after removal
            }
        }
        return removedCount;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] itemsArray = Arrays.copyOf(items, size);

        // Sorting logic using Arrays.sort
        Arrays.sort(itemsArray, (item1, item2) -> Integer.compare(item2.getCost(), item1.getCost()));

        return itemsArray;
    }

    @Override
    public int costTotal() {
        int totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    @Override
    public void setCustomer(Customer customer) {
        // Set the customer for the order
        this.customer = customer;
    }

    @Override
    public void setTableNumber(int tableNumber) {

    }

    @Override
    public int getTableNumber() {
        return 0;
    }

    @Override
    public Customer getCustomer() {
        // Get the customer for the order
        return this.customer;
    }
}
