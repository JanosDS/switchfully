package switchtothesun.attraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AttractionService {

	private final AttractionRepository attractionRepository;

	@Autowired
	public AttractionService(AttractionRepository attractionRepository) {
		this.attractionRepository = attractionRepository;
	}

	public List<Attraction> getAttractionByType(String type) {
		return attractionRepository.findAttractionsOfType(type);
	}

	public List<Attraction> getAllAttractions() {
		return attractionRepository.getAllAttractions();
	}

	public List<Attraction> findAttractionsInCountry(String country) {
		return attractionRepository.findAttractionsInCountry(country);
	}
}
