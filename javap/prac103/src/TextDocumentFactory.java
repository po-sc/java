public class TextDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen(String filePath) {
        TextDocument doc = new TextDocument();
        doc.openFile(filePath);
        return doc;
    }
}
