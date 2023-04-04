package solution.switchtothesun.tourist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import solution.switchtothesun.attraction.AttractionRepository;

import java.util.List;

@RestController
@RequestMapping("tourists")
public class TouristController {

    private final AttractionRepository attractionRepository;


    public TouristController(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @GetMapping
    public List<Tourist> getTouristByAttraction(@RequestParam String attraction) {
        return attractionRepository.findAttractionByName(attraction).getTouristList();
    }
}
