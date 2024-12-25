import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {

    Map<String, List<Theater>> cityTheaterMap;

    List<Theater> theaters;

    public TheaterController() {
        cityTheaterMap = new HashMap<>();
        theaters = new ArrayList<>();
    }

    public void addTheater(Theater theater) {
        theaters.add(theater);
        List<Theater> theaterList = cityTheaterMap.getOrDefault(theater.getCity(), new ArrayList<>());
        theaterList.add(theater);
        cityTheaterMap.put(theater.getCity(), theaterList);
    }

    //get all shows in a city
    Map<Theater,List<Show>> getShowsByCity(String city){
        Map<Theater,List<Show>> showsByCity = new HashMap<>();
        List<Theater> theaters = cityTheaterMap.get(city);
        for(Theater theater: theaters){
            showsByCity.put(theater,theater.getShows());
        }
        return showsByCity;
    }

}
