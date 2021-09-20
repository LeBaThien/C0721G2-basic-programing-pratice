package code_f4.collection.library_manager;

public class Document {
    private int idDocument;
    private String publisher;
    private int numberRelease;

    public Document(){

    }

    public Document(int idDocument, String publisher, int numberRelease) {
        this.idDocument = idDocument;
        this.publisher = publisher;
        this.numberRelease = numberRelease;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    @Override
    public String toString() {
        return "Document{" +
                "idDocument=" + idDocument +
                ", publisher='" + publisher + '\'' +
                ", numberRelease=" + numberRelease +
                '}';

    }


}
