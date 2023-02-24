package basic.codelab01;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private final Map<String, String> phoneBookEntries = ImmutableMap.<String, String>builder()
            .put("Jos de Vos", "016/161616")
            .put("An de Toekan", "016/161617")
            .put("Kris de Vis", "016/161618")
            .build();

    /**
     * Implement me!
     */
    public Optional<String> findPhoneNumberByName(String name) {
        return null;
    }

    /**
     * Implement me!
     */
    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        return null;
    }
}
