import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    ArrayList<Contact> myListOfContacts;

     Scanner scanner =new Scanner(System.in);
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

        String search;
        System.out.println("Write the name of the contact: ");
        myListOfContacts.removeIf(search -> search.c )
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

    void deleteContact() {

        char  yes = 'y';
        char  no = 'n';
        for (int pozitie = 0; pozitie < myListOfContacts.size(); pozitie++) {

            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            if (input.contains(myListOfContacts.get(pozitie).firstName)) {
                showContact(myListOfContacts.get(pozitie));
                System.out.println("Delete this contact ? Y/N");
                input = scanner.nextLine();
                if (input.startsWith(String.valueOf(yes)) || input.startsWith(String.valueOf(no))) {
                    myListOfContacts.remove(pozitie);
                } else {
                    System.out.println("Only Y/N input");
                }
            }

        }
    }

}
