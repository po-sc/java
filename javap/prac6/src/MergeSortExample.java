import java.util.ArrayList;
        import java.util.List;

public class MergeSortExample {

    public static void mergeSort(List<Student> students) {
        if (students.size() > 1) {
            int middle = students.size() / 2;

            List<Student> leftHalf = new ArrayList<>(students.subList(0, middle));
            List<Student> rightHalf = new ArrayList<>(students.subList(middle, students.size()));

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(students, leftHalf, rightHalf);
        }
    }

    private static void merge(List<Student> students, List<Student> left, List<Student> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                students.set(k++, left.get(i++));
            } else {
                students.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            students.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            students.set(k++, right.get(j++));
        }
    }
}

