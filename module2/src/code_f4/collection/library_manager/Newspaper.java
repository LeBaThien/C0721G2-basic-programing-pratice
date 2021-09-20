package code_f4.collection.library_manager;

public class Newspaper extends Document{
    private int dateOfRelease;

    public Newspaper (){

    }

    public Newspaper(int dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public Newspaper(int idDocument, String publisher, int numberRelease, int dateOfRelease) {
        super(idDocument, publisher, numberRelease);
        this.dateOfRelease = dateOfRelease;
    }

    public int getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(int dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public String toString() {
        return "Newspaper{" + "idDocument=" + getIdDocument() +
                ", publisher='" + getPublisher() + '\'' +
                ", numberRelease=" + getNumberRelease() +
                ", dateOfRelease=" + getDateOfRelease() +
                '}';
    }
}
