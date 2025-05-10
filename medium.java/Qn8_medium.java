/*reate a class Contact with fields: name, phoneNumber, emailAddress. Create 3 Contact objects. 
Print the contact details only if the emailAddress is not empty (use if condition).*/
class Contact {
    String name;
    String phoneNumber;
    String emailAddress;

    Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    void displayContact() {
        if (!emailAddress.isEmpty()) {
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + emailAddress);
            System.out.println("-------------------------");
        }
    }
}
public class Qn8_medium {
    public static void main(String[] args) {
        Contact c1 = new Contact("Sujan", "9800000001", "sthasujan@gmail.com");
        Contact c2 = new Contact("Ram", "9800000002", "ram@gmail.com");
        Contact c3 = new Contact("Shyam", "9800000003", "shyam@domain.com"); 
        c1.displayContact();
        c2.displayContact();
        c3.displayContact();
    }
}