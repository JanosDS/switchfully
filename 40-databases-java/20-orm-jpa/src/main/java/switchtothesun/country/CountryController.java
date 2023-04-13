package switchtothesun.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("countries")
public class CountryController {

	private final CountryRepository countryRepository;
	private final CountryService countryService;

	@Autowired
	public CountryController(CountryRepository countryRepository, CountryService countryService) {
		this.countryRepository = countryRepository;
		this.countryService = countryService;
	}

	@GetMapping(produces = "application/json")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}

	@PostMapping(consumes = "application/json")
	@ResponseStatus(CREATED)
	public void addCountry(@RequestBody Country country) {
		countryService.addCountry(country);
	}

	@DeleteMapping(path = "{id}")
	@ResponseStatus(OK)
	public void deleteCountry(@PathVariable int id) {
		countryService.delete(id);
	}
}
