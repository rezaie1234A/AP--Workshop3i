public class Contact {
    private String Group;
    private String email;
    private String firstname;
    private String lastname;
    private PhoneNumber phoneNumber;
    private Address Address;
    public Contact(String Group, String email, String firstname, String lastname, PhoneNumber phoneNumber,Address Address) {
        this.Group = Group;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
    }
    public String getGroup() {
        return Group;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
    public Address getAddress() {
        return Address;
    }
    public void setGroup(String Group) {
        this.Group = Group;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(Address Address) {
        this.Address = Address;
    }
    public String toString() {
        return "Contact [Group=" + Group + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname+ ", phoneNumber=" + phoneNumber + ", Address=" + Address;
    }
}
