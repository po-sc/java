
public class QueueNode {
    public QueueNode next;
    public QueueNode prev;
    public Order value;

    public QueueNode(Order value) {
        this.value = value;
    }
}
