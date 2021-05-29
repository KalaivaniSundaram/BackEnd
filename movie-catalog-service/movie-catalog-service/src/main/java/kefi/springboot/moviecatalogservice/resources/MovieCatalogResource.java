package kefi.springboot.moviecatalogservice.resources;

import kefi.springboot.moviecatalogservice.model.CatalogList;
import kefi.springboot.moviecatalogservice.model.Movie;
import kefi.springboot.moviecatalogservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 16-07-2020
 */


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @RequestMapping("/{userId}")
    public List<CatalogList> getMovieCatalog(@PathVariable("userId") String userId) {

        RestTemplate restTemplate = new RestTemplate();

        //getObject from restTemplate , can be String
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 4),
                new Rating("456", 3)
        );

        //For each movie ID, call movie info service

        return ratings.stream().map(rating -> {

            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
            return new CatalogList(movie.getName(), "Horrible", rating.getRating());


        }).collect(Collectors.toList());

        //Put all together


    }
}
