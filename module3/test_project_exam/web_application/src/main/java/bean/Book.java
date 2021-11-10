package bean;

public class Book {
    private Integer bookId;
    private String nameBook;
    private String author;
    private String description;
    private String numberOfBook;

    public Book(Integer bookId, String nameBook, String author, String description, String numberOfBook) {
        this.bookId = bookId;
        this.nameBook = nameBook;
        this.author = author;
        this.description = description;
        this.numberOfBook = numberOfBook;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(String numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
}
