import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryUtils {
    public static List<String> listFirstFiveFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        List<String> fileNames = new ArrayList<>();

        if (files != null) {
            for (int i = 0; i < Math.min(files.length, 5); i++) {
                fileNames.add(files[i].getName());
            }
        }

        return fileNames;
    }

    public static void main(String[] args) {
        // Пример использования
        List<String> fileNames = listFirstFiveFiles("/Users/po_scripty/Documents/INTELJIDEA/JAVAPROG/lab10"); // Замените на ваш путь
        fileNames.forEach(System.out::println);
    }
}