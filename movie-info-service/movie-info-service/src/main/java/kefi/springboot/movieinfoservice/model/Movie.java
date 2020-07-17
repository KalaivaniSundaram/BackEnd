package kefi.springboot.movieinfoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 17-07-2020
 */
@Data
@AllArgsConstructor
public class Movie {

    private String movieId;
    private String name;

}
