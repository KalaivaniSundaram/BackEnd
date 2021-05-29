package kefi.springboot.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 17-07-2020
 */
@Data
@AllArgsConstructor
public class Rating {

    private String movieId;
    private Integer rating;
}
