import java.util.Arrays;

// Интерфейс для определения контракта очереди
interface Queue {
    void enqueue(int value);
    int element();
    int dequeue();
    int size();
    boolean isEmpty();
    void clear();
}

// Реализация очереди с использованием массива (класс ArrayQueue)
class ArrayQueue implements Queue {
    private int[] array;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue() {
        array = new int[10]; // начальный размер массива
        size = 0;
        front = 0;
        rear = -1;
    }

    // Добавление элемента в очередь
    public void enqueue(int value) {
        ensureCapacity();
        rear = (rear + 1) % array.length;
        array[rear] = value;
        size++;
    }

    // Получение первого элемента в очереди
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[front];
    }

    // Удаление и возврат первого элемента в очереди
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedValue = array[front];
        front = (front + 1) % array.length;
        size--;
        return removedValue;
    }

    // Получение текущего размера очереди
    public int size() {
        return size;
    }

    // Проверка, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Очистка очереди
    public void clear() {
        array = new int[10]; // возвращаем начальный размер массива
        size = 0;
        front = 0;
        rear = -1;
    }

    // Вспомогательный метод для увеличения размера массива при необходимости
    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}

// Класс с методом main для тестирования
public class Main {
    public static void main(String[] args) {
        // Пример использования
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);

        System.out.println("Front element: " + arrayQueue.element());
        System.out.println("Dequeue: " + arrayQueue.dequeue());
        System.out.println("Size: " + arrayQueue.size());
        System.out.println("Is Empty: " + arrayQueue.isEmpty());

        arrayQueue.clear();
        System.out.println("Is Empty after clear: " + arrayQueue.isEmpty());
    }
}
