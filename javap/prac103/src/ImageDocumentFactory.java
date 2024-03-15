public class ImageDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen(String filePath) {
        ImageDocument doc = new ImageDocument();
        doc.openFile(filePath);
        return doc;
    }
}
