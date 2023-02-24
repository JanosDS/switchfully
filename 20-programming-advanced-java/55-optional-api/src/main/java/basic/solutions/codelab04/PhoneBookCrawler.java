package basic.solutions.codelab04;

import basic.codelab04.PhoneBook;

public class PhoneBookCrawler {
    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseGet(() -> phoneBook.toString());
    }
}
