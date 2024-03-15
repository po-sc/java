public interface IDocument {
    void open();
    void close();
    void save();
    void openFile(String filePath);
}
