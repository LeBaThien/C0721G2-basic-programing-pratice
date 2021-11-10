package bean;

public class BookCard {
    private Integer bookCardId;
    private Book book;
    private Student student;
    private String status;
    private String startDate;
    private String endDate;

    public BookCard(Integer bookCardId, Book book, Student student, String status, String startDate, String endDate) {
        this.bookCardId = bookCardId;
        this.book = book;
        this.student = student;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getBookCardId() {
        return bookCardId;
    }

    public void setBookCardId(Integer bookCardId) {
        this.bookCardId = bookCardId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
