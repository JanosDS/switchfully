package solution.switchtothesun.country;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(produces = "application/json")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping(produces = "application/json", params = "continent")
    public List<Country> getCountriesByContinent(@RequestParam String continent) {
        return countryService.getAllCountriesByContinent(continent);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(CREATED)
    public void addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
    }

    @DeleteMapping(path = "{id}")
    @ResponseStatus(OK)
    public void deleteCountry(@PathVariable Long id) {
        countryService.delete(id);
    }
}
