package solution.switchtothesun.country;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import solution.switchtothesun.continent.ContinentRepository;

import java.util.List;

@Service
@Transactional
public class CountryService {

    private final CountryRepository countryRepository;
    private final ContinentRepository continentRepository;

    public CountryService(CountryRepository countryRepository, ContinentRepository continentRepository) {
        this.countryRepository = countryRepository;
        this.continentRepository = continentRepository;
    }

    public List<Country> getAllCountries() {
        return countryRepository.getAllCountries();
    }

    public void addCountry(Country country) {
        countryRepository.addCountry(country);
    }

    public void delete(Long id) {
        countryRepository.delete(id);
    }

    public List<Country> getAllCountriesByContinent(String continent) {
        return continentRepository.findContinentByName(continent).getCountryList();
    }
}
