import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {


    ArrayList<Contact> myListOfContacts;
    private Scanner scanner = new Scanner(System.in);
    public String search;

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

        System.out.println("Write the first name of the contact: ");
        search = scanner.next();

        for (Contact searchName : myListOfContacts) {
            if (searchName.firstName.startsWith(search)) {
                System.out.println("Contact found !");
                showContact(searchName);
            } else {
                System.out.println("Contact not found");
            }
        }
    }

    void deleteContact() {

        System.out.println("Write the first name of the contact: ");

         search = scanner.next();

        for (Contact searchNameOfContact : myListOfContacts) {
            if (searchNameOfContact.firstName.startsWith(search)) {
                showContact(searchNameOfContact);
                System.out.println("Delete contact?");
                System.out.println("Y for yes and N for no");

                char input = scanner.next().toLowerCase().charAt(0);

                switch (input) {
                    case 'y':
                        try {
                            myListOfContacts.remove(myListOfContacts.get(Integer.parseInt(searchNameOfContact.toString())));
                            System.out.println("Contact deleted !");
                        } catch (Exception exception){
                            System.out.println("Something happend");
                        }

                        break;
                    case 'n':
                        break;
                }
            }
        }
    }
    void changeParameter(){
        String input;
        System.out.println("What contact do you wish to change ?");

        for (Contact searchContactInList : myListOfContacts){

            int i = 1;
            System.out.println("Position: "+i);
            searchContact(searchContactInList);

            input = scanner.next();
            if (searchContactInList.firstName.startsWith(input)){

                input = scanner.nextLine();
                int finalInput = Integer.parseInt(input);
                myListOfContacts.set(finalInput, searchContactInList);
                System.out.println("Change the first name: ");

            }

        }

        System.out.println("What do you wish to change ?");
        input = scanner.next();
        if (input.startsWith("fi")){

        } else if (input.startsWith("sec")) {

        } else if (input.startsWith("email")) {

        } else if (input.startsWith("phone")) {

        }else {
            System.out.println("Wrong");
        }
    }
}
