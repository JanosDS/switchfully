package solution.switchtothesun.attraction;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AttractionService {

    private final AttractionRepository attractionRepository;

    public AttractionService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    public List<Attraction> getAllAttractions() {
        return attractionRepository.getAllAttractions();
    }

    public List<Attraction> findAttractionsOfType(AttractionType type) {
        return attractionRepository.findAttractionsOfType(type);
    }

    public List<Attraction> findAttractionsInCountry(String country) {
        return attractionRepository.findAttractionsInCountry(country);
    }

    public List<Attraction> findAttractionsByTourist(String tourist) {
        return attractionRepository.getAttractionsByTourist(tourist);
    }
}
