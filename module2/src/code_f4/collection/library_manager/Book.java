package code_f4.collection.library_manager;

public class Book extends Document {
    private String nameAuthor;
    private int numberOfPage;

    public Book(){

    }

    public Book(String nameAuthor, int numberOfPage) {
        this.nameAuthor = nameAuthor;
        this.numberOfPage = numberOfPage;
    }

    public Book(int idDocument, String publisher, int numberRelease, String nameAuthor, int numberOfPage) {
        super(idDocument, publisher, numberRelease);
        this.nameAuthor = nameAuthor;
        this.numberOfPage = numberOfPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idDocument=" + getIdDocument() +
                ", publisher='" + getPublisher() + '\'' +
                ", numberRelease=" + getNumberRelease() +
                "nameAuthor='" + nameAuthor + '\'' +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
