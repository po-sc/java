public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }

    public void setElement(int index, T element) {
        array[index] = element;
    }

    public static void main(String[] args) {
        // Пример использования
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);
        System.out.println("Element at index 2: " + genericIntArray.getElement(2));

        String[] stringArray = {"hello", "world"};
        GenericArray<String> genericStringArray = new GenericArray<>(stringArray);
        System.out.println("Element at index 1: " + genericStringArray.getElement(1));
    }
}