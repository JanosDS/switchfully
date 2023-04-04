package solution.switchtothesun.application_info;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("application-info")
public class ApplicationInfoController {

    private final ApplicationInfoService applicationInfoService;

    public ApplicationInfoController(ApplicationInfoService applicationInfoService) {
        this.applicationInfoService = applicationInfoService;
    }

    @GetMapping(path = "/0", produces = "application/json")
    public ApplicationInfo getApplicationInfo() {
        return applicationInfoService.getApplicationInfo();
    }

    @PutMapping(path = "/0", consumes = "application/json")
    public void updateApplicationInfo(@RequestBody ApplicationInfo applicationInfo) {
        applicationInfoService.updateApplicationInfo(applicationInfo);
    }
}
