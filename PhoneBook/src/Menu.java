
import java.util.Scanner;

public class Menu {

    private final PhoneBook phoneBook = new PhoneBook();
    private final Scanner scanner = new Scanner(System.in);

    void showMenu() {
        System.out.println("--Meniu--");
        System.out.println("1. Show Phone Book");
        System.out.println("2. Add Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Change parameters");
        System.out.println("6. Exit PhoneBook");


        while (true) {
            int userInput = scanner.nextInt();
            char input;

            String asnwer;
            if (userInput == 1) {
                phoneBook.showMyPhoneBook();
                showMenu();
            } else if (userInput == 2) {
                phoneBook.readAndWrite();
                showMenu();
            } else if (userInput == 3) {
                
                phoneBook.searchContact();

                System.out.println("Return to menu ?");
                System.out.println("Y for yes and N for no");
                input = scanner.next().toLowerCase().charAt(0);

                switch (input) {
                    case 'y':
                        showMenu();
                    case 'n':
                        System.out.println("Have a good day !");
                        System.exit(0);
                }


            } else if (userInput == 4) {

                phoneBook.deleteContact();
                System.out.println("Return to menu ?");
                input = scanner.next().toLowerCase().charAt(0);
                switch (input) {
                    case 'y':
                        showMenu();
                    case 'n':
                        System.exit(0);
                }
            } else if (userInput == 5) {
                phoneBook.changeParameter();
            }
        }
    }
}


