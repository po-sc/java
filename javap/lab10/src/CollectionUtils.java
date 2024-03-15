import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtils {
    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> Set<T> newHashSet() {
        return new HashSet<>();
    }

    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static void main(String[] args) {
        // Примеры использования
        List<Integer> intList = newArrayList();
        intList.add(1);
        intList.add(2);
        System.out.println("ArrayList: " + intList);

        Set<String> stringSet = newHashSet();
        stringSet.add("hello");
        stringSet.add("world");
        System.out.println("HashSet: " + stringSet);

        Map<Integer, String> map = newHashMap();
        map.put(1, "one");
        map.put(2, "two");
        System.out.println("HashMap: " + map);
    }
}