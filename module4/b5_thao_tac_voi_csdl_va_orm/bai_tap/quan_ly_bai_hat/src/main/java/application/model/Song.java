package application.model;

import javax.persistence.*;

@Entity
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    @Column (name="author")
    private String author;
    @Column (name="type_Of_Song")
    private String typeOfSong;
    @Column (name="path")
    private String path;

    public Song() {
    }

    public Song(int id, String author, String typeOfSong, String path) {
        this.id = id;
        this.author = author;
        this.typeOfSong = typeOfSong;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypeOfSong() {
        return typeOfSong;
    }

    public void setTypeOfSong(String typeOfSong) {
        this.typeOfSong = typeOfSong;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
