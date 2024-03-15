import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    public void add(E element) {
        content.add(element);
    }

    public E remove() {
        return content.poll();
    }

    public boolean contains(E element) {
        return content.contains(element);
    }

    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public String toString() {
        return content.toString();
    }
}
