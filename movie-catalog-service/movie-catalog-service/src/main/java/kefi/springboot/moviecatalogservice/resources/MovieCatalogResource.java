package kefi.springboot.moviecatalogservice.resources;

import kefi.springboot.moviecatalogservice.model.CatalogList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogList> movieCatalog(@PathVariable("userId") String userId) {
        return Collections.singletonList(
                new CatalogList("Titanic", "Horrible", "4")
        );

    }
}
