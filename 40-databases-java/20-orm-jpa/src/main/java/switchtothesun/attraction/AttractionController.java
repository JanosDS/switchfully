package switchtothesun.attraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("attractions")
public class AttractionController {

	private final AttractionService attractionService;

	@Autowired
	public AttractionController(AttractionService attractionService) {
		this.attractionService = attractionService;
	}

	@GetMapping(produces = "application/json")
	public List<Attraction> getAllAttractions() {
		return attractionService.getAllAttractions();
	}

	@GetMapping(params = "type", produces = "application/json")
	public List<Attraction> getAttractionsByType(@RequestParam String type) {
		return attractionService.getAttractionByType(type);
	}

	@GetMapping(params = "country", produces = "application/json")
	public List<Attraction> getAttractionsByCountry(@RequestParam String country) {
		return attractionService.findAttractionsInCountry(country);
	}
}
