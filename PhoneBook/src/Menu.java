import java.util.Scanner;

public class Menu {
    PhoneBook phoneBook = new PhoneBook();

    void showMenu(){
        System.out.println("--Meniu--");
        System.out.println("1. Show Phone Book");
        System.out.println("2. Add Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        if (userInput == 1){
            phoneBook.showMyPhoneBook();
            showMenu();
        } else if (userInput == 2) {
            phoneBook.readAndWrite();
            showMenu();
        } else if (userInput == 3) {
            phoneBook.searchContact();
        } else if (userInput == 4) {
            phoneBook.deleteContact();
        }
    }

}
