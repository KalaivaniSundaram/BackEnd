package kefi.springboot.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 17-07-2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private String movieId;
    private String name;

}
