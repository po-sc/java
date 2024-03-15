import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }

    public String toString() {
        return "UnfairWaitList: " + content.toString();
    }
}
