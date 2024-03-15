public class MusicDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a new Music Document");
    }

    @Override
    public void close() {
        System.out.println("Closing Music Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Music Document");
    }

    @Override
    public void openFile(String filePath) {
        System.out.println("Opening existing Music Document from: " + filePath);
        // Здесь добавить логику чтения музыкального файла
    }
}
