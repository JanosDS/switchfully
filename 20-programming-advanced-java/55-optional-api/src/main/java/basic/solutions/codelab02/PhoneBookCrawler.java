package basic.solutions.codelab02;

import basic.codelab02.PhoneBook;

public class PhoneBookCrawler {
    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameDefensively(String name) {
        return phoneBook.findPhoneNumberByName(name).orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }
}
