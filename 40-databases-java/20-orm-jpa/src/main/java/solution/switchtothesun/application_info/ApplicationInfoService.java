package solution.switchtothesun.application_info;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ApplicationInfoService {

    private final ApplicationInfoRepository applicationInfoRepository;

    public ApplicationInfoService(ApplicationInfoRepository applicationInfoRepository) {
        this.applicationInfoRepository = applicationInfoRepository;
    }

    public ApplicationInfo getApplicationInfo() {
        return applicationInfoRepository.getApplicationInfo();
    }

    public void updateApplicationInfo(ApplicationInfo newApplicationInfo) {
        ApplicationInfo applicationInfo = applicationInfoRepository.getApplicationInfo();
        applicationInfo.setAdminEmail(newApplicationInfo.getAdminEmail());
        applicationInfo.setTitle(newApplicationInfo.getTitle());
        applicationInfo.setVersion(newApplicationInfo.getVersion());
    }
}
