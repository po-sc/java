public class MusicDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen(String filePath) {
        MusicDocument doc = new MusicDocument();
        doc.openFile(filePath);
        return doc;
    }
}
