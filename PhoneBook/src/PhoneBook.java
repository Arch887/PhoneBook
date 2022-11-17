import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    ArrayList<Contact> myListOfContacts;

    Scanner scanner = new Scanner(System.in);
    String search;

    public PhoneBook() {
        myListOfContacts = new ArrayList<>();
    }

    void showContact(Contact cont) {

        System.out.println("---------------------");
        System.out.println("FirstName: " + cont.firstName);
        System.out.println("LastName: " + cont.lastName);
        System.out.println("Email: " + cont.email);
        System.out.println("PhoneNumber: " + cont.phoneNumber);
        System.out.println("---------------------");

    }

    void showMyPhoneBook() {
        System.out.println("PhoneBook List");
        int i = 1;
        for (int pozitie = 0; pozitie < myListOfContacts.size(); pozitie++) {
            System.out.println("Position: " + i);
            i++;
            showContact(myListOfContacts.get(pozitie));

        }
    }

    void addContact(Contact addContact) {
        myListOfContacts.add(addContact);
    }

    void readAndWrite() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter FirstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter LastName");
        String lastName = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter PhoneNumber");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, email, phoneNumber);
        addContact(contact);

    }


    void searchContact() {

        System.out.println("Write the name of the contact: ");
        search = scanner.next();

        for (Contact searchName : myListOfContacts) {
            if (searchName.firstName.startsWith(search)) {
                System.out.println("Contact found !");
                showContact(searchName);
            } else {
                System.out.println("Contact not found");
                System.out.println("Return to menu ?");
                System.out.println("Y for yes and N for no");
                String asnwer = scanner.nextLine();


                if (asnwer.startsWith("y")) {
                    System.out.println("Return to menu");

                } else if (asnwer.startsWith("n")) {
                    searchContact();
                }
            }

        /*ArrayList<Contact> contactFound = new ArrayList<>();
        for (int pozitie = 0; pozitie < myListOfContacts.size(); pozitie++) {


            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.contains(myListOfContacts.get(pozitie).firstName)) {
                showContact(myListOfContacts.get(pozitie));
                contactFound.add(myListOfContacts.get(pozitie));
            }

        }*/

        }


    }
    void deleteContact () {

        System.out.println("Write the name of the contact: ");
        String search = scanner.nextLine();
        for (Contact searchName : myListOfContacts) {
            if (searchName.firstName.contains(search)) {
                System.out.println("Delete contact?");
                System.out.println("Y for yes and N for no");
                String answer = scanner.nextLine();
                if (answer.startsWith("y")) {
                    myListOfContacts.removeIf(searchLastName -> searchName.firstName.contains(search));
                } else if (answer.startsWith("n")) {

                }
            }
        }
    }
}



