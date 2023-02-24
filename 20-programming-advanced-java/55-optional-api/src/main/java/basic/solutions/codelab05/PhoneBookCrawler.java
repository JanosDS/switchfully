package basic.solutions.codelab05;

public class PhoneBookCrawler {
    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    /**
     * Implement this method so that you first try to search a phone number by name
     * if that doesn't return anything search a name by phone number
     * if that doesn't return anything return the phone number of Jos de Vos
     */
    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber) {
        return phoneBook.findPhoneNumberByName(name)
                .or(() -> phoneBook.findNameByPhoneNumber(phoneNumber))
                .or(() -> phoneBook.findPhoneNumberByName("Jos de Vos"))
                .orElseThrow(() -> new RuntimeException(""));
    }
}
