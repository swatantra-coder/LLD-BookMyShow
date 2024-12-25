import java.util.List;

public class Show {
    int id;
    Movie movie;
    Screen screen;
    String startTime;
    List<Integer> bookedSeats;

    public Show(int id, Movie movie, Screen screen, String startTime, List<Integer> bookedSeats) {
        this.id = id;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.bookedSeats = bookedSeats;
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getStartTime() {
        return startTime;
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }


}
