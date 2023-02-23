package basic.codelab03;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class PhoneBook {

    private final Map<String, String> phoneBookEntries = ImmutableMap.<String, String>builder()
            .put("Jos de Vos", "016/161616")
            .put("An de Toekan", "016/161617")
            .put("Kris de Vis", "016/161618")
            .build();

    public Optional<String> findPhoneNumberByName(String name) {
        return Optional.ofNullable(phoneBookEntries.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        for (Entry<String, String> entry : phoneBookEntries.entrySet()) {
            if(entry.getValue().equals(phoneNumber)) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}
