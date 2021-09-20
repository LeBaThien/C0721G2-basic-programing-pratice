package code_f4.collection.library_manager;

public class Journal extends Document {
    private int issueNumber;
    private int monthOfRelease;

    public Journal (){

    }

    public Journal(int issueNumber, int monthOfRelease) {
        this.issueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public Journal(int idDocument, String publisher, int numberRelease, int issueNumber, int monthOfRelease) {
        super(idDocument, publisher, numberRelease);
        this.issueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(int monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "idDocument=" + getIdDocument() +
                ", publisher='" + getPublisher() + '\'' +
                ", numberRelease=" + getNumberRelease() +
                "issueNumber=" + issueNumber +
                ", monthOfRelease=" + monthOfRelease +
                '}';
    }
}
