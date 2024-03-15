public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a new Text Document");
    }

    @Override
    public void close() {
        System.out.println("Closing Text Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Text Document");
    }

    @Override
    public void openFile(String filePath) {
        System.out.println("Opening existing Text Document from: " + filePath);
        // Здесь добавить логику чтения текстового файла
    }
}

