import java.util.List;

public class Theater {
    int id;
    String address;
    String city;
    List<Screen> screens;
    List<Show> shows;

    public Theater(int id, String address,String city, List<Screen> screens, List<Show> shows) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.screens = screens;
        this.shows = shows;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
