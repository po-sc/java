import java.util.Arrays;
import java.util.List;

public class ArrayUtils {
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        // Пример использования для массива чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer List: " + intList);

        // Пример использования для массива строк
        String[] stringArray = {"hello", "world"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String List: " + stringList);
    }
}