class m<T extends Comparable<T>> {
    private final T[] array;

    // Конструктор класса, принимающий массив элементов типа T
    public m(T[] array) {
        this.array = array;
    }

    // Линейный поиск в массиве
    public int linearSearch(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i; // Если элемент найден, возвращается его индекс
            }
        }
        return -1; // Если элемент не найден, возвращается -1
    }

    // Бинарный поиск в отсортированном массиве
    public int binarySearch(T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison == 0) {
                return mid; // Если элемент найден, возвращается его индекс
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Если элемент не найден, возвращается -1
    }

    public static void main(String[] args) {
        // Пример использования с массивом целых чисел
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        m<Integer> intSearch = new m<>(intArray);

        int key = 6; // Элемент, который мы ищем

        // Выполнение линейного поиска
        int linearResult = intSearch.linearSearch(key);
        System.out.println("Linear search result: " + linearResult);

        // Выполнение бинарного поиска
        int binaryResult = intSearch.binarySearch(key);
        System.out.println("Binary search result: " + binaryResult);
    }
}
