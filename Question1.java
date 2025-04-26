import java.util.ArrayList;

class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Contacts {
    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String phoneNumber) {
        contactList.add(new Contact(name, phoneNumber));
    }

    public void viewAll() {
        for (Contact contactData : contactList) {
            System.out.println("Name = " + contactData.name);
            System.out.println("Phone number = " + contactData.phoneNumber);
        }
    }

    public void searchByName(String name) {
        boolean isFound = false;
        for (Contact contactData : contactList) {
            if (contactData.name.equalsIgnoreCase(name)) {
                System.out.println("Found data: " + contactData.name + " - " + contactData.phoneNumber);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Data not found");
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        contacts.addContact("Charles", "28737368");
        contacts.addContact("Peter", "28737368");
        contacts.addContact("John", "2873733968");

        System.out.println("All Contacts:");
        contacts.viewAll();

        System.out.println("\nSearching for 'Peter':");
        contacts.searchByName("Peter");

        System.out.println("\nSearching for 'Alice':");
        contacts.searchByName("Alice");
    }
}

// store the 5 most recent activities of a user. when a new activity is added:
// if the list al ready has 5, remove the oldest one first
