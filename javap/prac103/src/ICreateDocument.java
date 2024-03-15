public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(String filePath);
}
