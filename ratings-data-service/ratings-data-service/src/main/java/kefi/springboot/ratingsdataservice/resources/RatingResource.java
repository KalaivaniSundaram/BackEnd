package kefi.springboot.ratingsdataservice.resources;

import kefi.springboot.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 17-07-2020
 */

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {

    @RequestMapping("{movieId}")
    public Rating getRatingInfo(@PathVariable ("movieId") String movieId){
        return new Rating(movieId, 4);
    }
}
