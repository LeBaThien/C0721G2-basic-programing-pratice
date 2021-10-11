package models;

public class MovieScreening {
    private String movieId;
    private String filmName;
    private String showDate;
    private int numberOfSlot;

    public MovieScreening(String movieId, String filmName, String showDate, int numberOfSlot) {
        this.movieId = movieId;
        this.filmName = filmName;
        this.showDate = showDate;
        this.numberOfSlot = numberOfSlot;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public int getNumberOfSlot() {
        return numberOfSlot;
    }

    public void setNumberOfSlot(int numberOfSlot) {
        this.numberOfSlot = numberOfSlot;
    }

    @Override
    public String toString() {
        return "MovieScreening{" +
                "movieId='" + movieId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", showDate='" + showDate + '\'' +
                ", numberOfSlot=" + numberOfSlot +
                '}';
    }

    public String getInformationMovie(){
        return getMovieId() + "," + getFilmName() + "," + getShowDate() +"," + getNumberOfSlot();
    }
}
