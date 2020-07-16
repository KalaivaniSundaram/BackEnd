package kefi.springboot.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 16-07-2020
 */


@Data
@AllArgsConstructor
public class CatalogList {

    private String movieName;
    private String description;
    private String rating;

}
