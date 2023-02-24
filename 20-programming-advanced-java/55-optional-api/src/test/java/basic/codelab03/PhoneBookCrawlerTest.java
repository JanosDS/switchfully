package basic.codelab03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneBookCrawlerTest {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    void findPhoneNumberByNameAndPrintPhoneBookIfNothingFound() {
        Assertions.assertThat(phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Jos de Vos")).isEqualTo("016/161616");
    }

    @Test
    void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound() {
        String phoneBook = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Raf de Giraf");

        assertThat(phoneBook).isEqualTo("PhoneBook{phoneBookEntries={Jos de Vos=016/161616, An de Toekan=016/161617, Kris de Vis=016/161618}}");
    }
}
