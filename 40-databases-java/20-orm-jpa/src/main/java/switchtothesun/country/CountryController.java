package switchtothesun.country;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("countries")
public class CountryController {

    private final CountryRepository countryRepository;

    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping(produces = "application/json")
    public List<Country> getAllCountries() {
        return countryRepository.getAllCountries();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(CREATED)
    public void addCountry(@RequestBody Country country) {
        countryRepository.addCountry(country);
    }

    @DeleteMapping(path = "{name}")
    @ResponseStatus(OK)
    public void deleteCountry(@PathVariable String name) {
        countryRepository.delete(name);
    }
}
