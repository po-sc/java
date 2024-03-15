public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a new Image Document");
    }

    @Override
    public void close() {
        System.out.println("Closing Image Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Image Document");
    }

    @Override
    public void openFile(String filePath) {
        System.out.println("Opening existing Image Document from: " + filePath);
        // Здесь добавить логику чтения изображения
    }
}
