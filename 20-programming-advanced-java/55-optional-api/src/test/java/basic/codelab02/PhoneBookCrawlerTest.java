package basic.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookCrawlerTest {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    void findPhoneNumberByNameDefensively() {
        Assertions.assertThat(phoneBookCrawler.findPhoneNumberByNameDefensively("Jos de Vos")).isEqualTo("016/161616");
    }

    @Test
    void findPhoneNumberByNameDefensively_ThrowsErrorIfNoNumberIsFound() {
        Assertions.assertThatThrownBy(() -> phoneBookCrawler.findPhoneNumberByNameDefensively("Raf de Giraf"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("No phone number found");
    }
}
