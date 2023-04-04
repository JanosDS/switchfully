package solution.switchtothesun.attraction.attraction_overview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import solution.switchtothesun.attraction.AttractionRepository;

@RestController
@RequestMapping("attraction-overview")
public class AttractionOverviewController {

    private final AttractionRepository attractionRepository;

    public AttractionOverviewController(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @GetMapping
    public AttractionOverview getAttractionOverviewByAttraction(@RequestParam String attractionName) {
        return attractionRepository.findAttractionByName(attractionName).getAttractionOverview();
    }
}
