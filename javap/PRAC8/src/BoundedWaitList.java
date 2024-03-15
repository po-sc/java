import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        this.content = new ConcurrentLinkedQueue<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (content.size() < capacity) {
            super.add(element);
        }
    }

    public String toString() {
        return "BoundedWaitList: " + content.toString();
    }
}
