package basic.solutions.codelab03;

import basic.codelab03.PhoneBook;

public class PhoneBookCrawler {
    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElse(phoneBook.toString());
    }
}
