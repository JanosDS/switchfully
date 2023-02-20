package basic.codelab02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person pers = new Person("James akak", "james@earth.be");
        Agenda agenda = new Agenda("MyAgenda", pers);
        LocalDate today = LocalDate.of(2023, 02, 23);
        Entry event1 = new Entry(today, "CodeLabs");
        agenda.addEntry(event1);

        System.out.println(agenda.toString());
    }
}
