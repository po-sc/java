import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем список студентов для первого класса
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Шкляр", 19));
        list1.add(new Student("Кобилов", 19));
        list1.add(new Student("Антуфьев", 19));

        // Создаем список студентов для второго класса
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Смольников", 19));
        list2.add(new Student("Голощапов", 20));

        // Объединяем списки студентов
        List<Student> mergedList = new ArrayList<>(list1.size() + list2.size());
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Сортируем объединенный список
        MergeSortExample.mergeSort(mergedList);

        // Выводим отсортированный список студентов
        System.out.println("Отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }
}
