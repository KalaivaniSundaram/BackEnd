package kefi.springboot.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CatalogList {

    private String movieName;
    private String description;
    private String rating;

}
