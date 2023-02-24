package basic.codelab04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
class PhoneBookCrawlerTest {
    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    void findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(CapturedOutput capturedOutput) {
        assertThat(phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Jos de Vos")).isEqualTo("016/161616");
        assertThat(capturedOutput).isEmpty();
    }

    @Test
    void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound() {
        String phoneBook = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Raf de Giraf");
        assertThat(phoneBook).isEqualTo("PhoneBook{phoneBookEntries={Jos de Vos=016/161616, An de Toekan=016/161617, Kris de Vis=016/161618}}");
    }
}
