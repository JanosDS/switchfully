package switchtothesun.country;

import examples.jdbc.Country;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("countries")
public class CountryController {

    @GetMapping(produces = "application/json")
    public List<Country> getAllCountries() {
        throw new NotYetImplementedException("Implement me!");
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(CREATED)
    public void addCountry(@RequestBody Country country) {
        throw new NotYetImplementedException("Implement me!");
    }

    @DeleteMapping(path = "{name}")
    @ResponseStatus(OK)
    public void deleteCountry(@PathVariable String name) {
        throw new NotYetImplementedException();
    }
}
