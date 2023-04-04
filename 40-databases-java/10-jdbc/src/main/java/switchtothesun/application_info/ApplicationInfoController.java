package switchtothesun.application_info;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("application-info")
public class ApplicationInfoController {

    private ApplicationInfoRepository applicationInfoRepository;

    public ApplicationInfoController(ApplicationInfoRepository applicationInfoRepository) {
        this.applicationInfoRepository = applicationInfoRepository;
    }

    @GetMapping(path = "/1", produces = "application/json")
    public ApplicationInfo getApplicationInfo() {
        return applicationInfoRepository.getApplicationInfo();
    }

    @PutMapping(path = "/1", consumes = "application/json")
    public void updateApplicationInfo(@RequestBody ApplicationInfo applicationInfo) {

    }
}
