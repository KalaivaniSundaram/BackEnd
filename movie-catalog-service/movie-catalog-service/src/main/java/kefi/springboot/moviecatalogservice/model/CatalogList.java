package kefi.springboot.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author Kalaivani Sundaram
 * @version 1.0
 * @since 16-07-2020
 */


@Data
public class CatalogList {

    private String movieName;
    private String description;
    private String rating;

    public CatalogList(String name, String horrible, Integer rating) {
    }
}
