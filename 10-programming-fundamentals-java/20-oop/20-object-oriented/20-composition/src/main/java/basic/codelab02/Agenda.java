package basic.codelab02;

import java.util.ArrayList;

public class Agenda {
    private String name;
    private Person owner;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Agenda(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry newEntry) {
        if (!entries.contains(newEntry) && entries.size() <= 25) {
            entries.add(newEntry);
        }
    }

    @Override
    public String toString() {
        String str = "This agenda is from: " + owner.getFullName();
        for (Entry entry : entries) {
            str += "\n" + entry.toString();
        }
        return str;
    }
}
