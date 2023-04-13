package switchtothesun.country;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CountryService {

	private final CountryRepository countryRepository;

	@Autowired
	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	public List<Country> getAllCountries() {
		return countryRepository.getAllCountries();
	}

	public void addCountry(Country country) {
		countryRepository.addCountry(country);
	}

	public void delete(int id) {
		countryRepository.delete(id);
	}
}