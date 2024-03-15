import java.util.Arrays;

public class InternetOrder implements Order {
    private int size;
    private ListNode head;
    private ListNode tail;
    private Customer customer; // Added field to store the customer

    // Constructor
    public InternetOrder() {
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.customer = null;
    }

    @Override
    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode(item);
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
    public String[] itemsNames() {
        if (size == 0) {
            return new String[0]; // Return an empty array if there are no items
        }

        String[] names = new String[size];
        ListNode current = head;
        int index = 0;

        while (current != null) {
            names[index] = current.value.getName();
            current = current.next;
            index++;
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
        ListNode current = head;

        while (current != null) {
            if (current.value.getName().equals(itemName)) {
                quantity++;
            }
            current = current.next;
        }

        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int quantity = 0;
        ListNode current = head;

        while (current != null) {
            if (current.value.equals(item)) {
                quantity++;
            }
            current = current.next;
        }

        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] itemsArray = new MenuItem[size];
        ListNode current = head;
        int index = 0;

        while (current != null) {
            itemsArray[index] = current.value;
            current = current.next;
            index++;
        }

        return itemsArray;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.value.getName().equals(itemName)) {
                if (previous == null) {
                    head = current.next;
                    if (head == null) {
                        tail = null; // Update tail if head is now null
                    }
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        tail = previous; // Update tail if the last node is removed
                    }
                }
                size--;
                return true; // Item removed successfully
            }
            previous = current;
            current = current.next;
        }

        return false; // Item not found
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.value.equals(item)) {
                if (previous == null) {
                    head = current.next;
                    if (head == null) {
                        tail = null; // Update tail if head is now null
                    }
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        tail = previous; // Update tail if the last node is removed
                    }
                }
                size--;
                return true; // Item removed successfully
            }
            previous = current;
            current = current.next;
        }

        return false; // Item not found
    }

    @Override
    public int removeAll(String itemName) {
        int removedCount = 0;
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.value.getName().equals(itemName)) {
                if (previous == null) {
                    head = current.next;
                    if (head == null) {
                        tail = null; // Update tail if head is now null
                    }
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        tail = previous; // Update tail if the last node is removed
                    }
                }
                size--;
                removedCount++;
            } else {
                previous = current;
            }
            current = current.next;
        }

        return removedCount;
    }

    @Override
    public int removeAll(MenuItem item) {
        int removedCount = 0;
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.value.equals(item)) {
                if (previous == null) {
                    head = current.next;
                    if (head == null) {
                        tail = null; // Update tail if head is now null
                    }
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        tail = previous; // Update tail if the last node is removed
                    }
                }
                size--;
                removedCount++;
            } else {
                previous = current;
            }
            current = current.next;
        }

        return removedCount;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] itemsArray = getItems();

        // Sorting logic using Arrays.sort
        Arrays.sort(itemsArray, (item1, item2) -> Integer.compare(item2.getCost(), item1.getCost()));

        return itemsArray;
    }

    @Override
    public int costTotal() {
        int totalCost = 0;
        ListNode current = head;

        while (current != null) {
            totalCost += current.value.getCost();
            current = current.next;
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

    // ListNode class definition (assuming it's an inner class)
    private static class ListNode {
        public ListNode next;
        public MenuItem value;

        // Constructor to create a ListNode with a MenuItem value
        public ListNode(MenuItem value) {
            this.value = value;
        }
    }
}
