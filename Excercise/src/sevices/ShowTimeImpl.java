package sevices;

import check_validate.CheckValidate;
import csv.FilmToCsv;
import models.MovieScreening;

import java.util.*;

public class ShowTimeImpl implements ShowTime {
    private static Scanner scanner = new Scanner(System.in);
    private static final String ID = "^CL-[0-9]{4}+$";
    private static Map<MovieScreening,Integer> integerMap = new LinkedHashMap<>();

    @Override
    public void show() {
//        Set<Map.Entry<MovieScreening,Integer>> entries1 = integerMap.entrySet();
//        for(Map.Entry<MovieScreening,Integer> entry : entries1){
//            System.out.println(entry.getKey() + "," + entry.getValue() );
//        }
         integerMap = FilmToCsv.readData();
        Set<MovieScreening> movieScreenings = integerMap.keySet();
        for (MovieScreening movieScreening: movieScreenings){
            System.out.println(movieScreening + ":film " + integerMap.get(movieScreening));
        }


    }

    @Override
    public void add() {
        //  public MovieScreening(String movieId, String filmName, String showDate, int numberOfSlot) {
        //        this.movieId = movieId;
        //        this.filmName = filmName;
        //        this.showDate = showDate;
        //        this.numberOfSlot = numberOfSlot;

        System.out.println("Enter the movie Id");
        String movieId = CheckValidate.checkDataInput(ID);
        System.out.println("Enter the film name");
        String filmName = scanner.nextLine();
        System.out.println("Enter the date of show");
        String date = scanner.nextLine();
        System.out.println("Enter the number of slot");
        int numberOfSlot = scanner.nextInt();
        MovieScreening movieScreening = new MovieScreening(movieId,filmName,date,numberOfSlot);
        integerMap.put(movieScreening,0);
        FilmToCsv.writeListMovieToCSV(integerMap);
    }

    @Override
    public void delete() {
        System.out.println("Enter the id film");
        String filmFilm = CheckValidate.checkDataInput(ID);
        Set<MovieScreening> movieScreenings = integerMap.keySet();
        for (MovieScreening movieScreening : movieScreenings) {
            if (filmFilm.equals(integerMap.get(movieScreening))) {
            System.out.println(movieScreening + ":film " + integerMap.get(movieScreening));
            }
        }
    }
}
