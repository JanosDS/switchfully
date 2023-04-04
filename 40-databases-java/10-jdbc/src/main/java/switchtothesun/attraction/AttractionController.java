package switchtothesun.attraction;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("attractions")
public class AttractionController {

    private final AttractionRepository attractionRepository;

    public AttractionController(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @GetMapping(produces = "application/json")
    public List<Attraction> getAllAttractions() {
        return attractionRepository.getAllAttractions();
    }

    @GetMapping(params = "type", produces = "application/json")
    public List<Attraction> getAttractionsByType(@RequestParam String type) {
        throw new NotYetImplementedException("Implement me!");
    }

    @GetMapping(params = "country", produces = "application/json")
    public List<Attraction> getAttractionsByCountry(@RequestParam String country) {
        throw new NotYetImplementedException("Implement me!");
    }
}
