//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        Address address1=new Address("12345","Iran","Tehran\n");
        PhoneNumber phoneNumber=new PhoneNumber("+98","9964401234\n");
        Contact contact1=new Contact("Friends","ahmad.re12345@gmail.com","Ahmad","Mohammadi",phoneNumber,address1);

        Address address2=new Address("54321","Afghanistan","Herat\n");
        PhoneNumber phoneNumber2=new PhoneNumber("+93","730198984\n");
        Contact contact=new Contact("Family","reza1221@gmail.com","Matin","Nemati",phoneNumber2,address2);
        phoneBook.addContact(contact1);
        phoneBook.addContact(contact);

        System.out.println("All Contacts");
        phoneBook.printContacts();

        boolean deleted =phoneBook.deleteContact("Matin","Nemati");
        if(deleted){
            System.out.println("Contact deleted successfully");
        }
        System.out.println("\n All Contacts After Deletion");
        phoneBook.printContacts();





    }
}