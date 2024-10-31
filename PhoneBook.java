import java.util.ArrayList;
import java.util.List;
public class PhoneBook {
    private List<Contact> contacts;
    public PhoneBook() {
        contacts = new ArrayList<>();
    }
   public  boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if(c.getFirstname().equals(contact.getFirstname()) && c.getLastname().equals(contact.getLastname())) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }
   public boolean deleteContact(String firstname, String lastname) {
        for (Contact c : contacts) {
            if(c.getFirstname().equals(firstname) && c.getLastname().equals(lastname)) {
                contacts.remove(c);
                return true;
            }
        }
        return false;
    }
    public Contact findContact(String firstname, String lastname) {
        for (Contact c : contacts) {
            if(c.getFirstname().equals(firstname) && c.getLastname().equals(lastname)) {
                return c;
            }
        }
        return null;
    }
    public List<Contact> findContacts(String group){
        List<Contact> contacts = new ArrayList<>();
        for (Contact c : contacts) {
            if(c.getFirstname().equals(group) && c.getLastname().equals(group)) {
                contacts.add(c);
            }
        }
        return contacts.isEmpty() ? null : contacts;
    }
    public void printContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
