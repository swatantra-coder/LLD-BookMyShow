import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<String, List<Movie>> cityMovieMap;
    List<Movie> movieShowMap;

    MovieController(){
        cityMovieMap = new HashMap<>();
        movieShowMap = new ArrayList<>();
    }

    //ADD MOVIE

    void addMovie(Movie movie){
        movieShowMap.add(movie);
        List<Movie> movies = cityMovieMap.getOrDefault(movie, new ArrayList<>());
        movies.add(movie);
    }

    //GET MOVIES BY NAME

    List<Movie> getMoviesByName(String name){
        List<Movie> movies = new ArrayList<>();
        for(Movie movie: movieShowMap){
            if(movie.getName().equals(name)){
                movies.add(movie);
            }
        }
        return movies;
    }

    //GET MOVIES BY CITY

    List<Movie> getMoviesByCity(String city){
        return cityMovieMap.get(city);
    }


}
