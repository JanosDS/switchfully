package basic.codelab05;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneBookCrawlerTest {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber_foundByName() {
        String phoneNumber = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Kris de Vis", "016/161619");

        assertThat(phoneNumber).isEqualTo("016/161618");
    }

    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber_foundByPhoneNumber() {
        String name = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Raf de Giraf", "016/161617");

        assertThat(name).isEqualTo("An de Toekan");
    }

    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber_nothingFoundReturnsJosDeVosPhoneNumber() {
        String name = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Raf de Giraf", "016/161619");

        assertThat(name).isEqualTo("016/161616");
    }

}
