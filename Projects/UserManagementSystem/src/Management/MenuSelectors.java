package Management;

import Services.Registration;

import java.util.Scanner;

public class MenuSelectors {
    private Scanner scanner = new Scanner(System.in);

    public void mainMenuSelector() {
        Registration registration = new Registration();
        int option = this.scanner.nextInt();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                registration.registrationOfUser();
                break;
            case 2:
                //registerForAdmin
                break;
            default:
                //There is no such an option !!!
        }
    }

    public void userMenuSelector() {
        int option = this.scanner.nextInt();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                //Show my datas
                break;
            case 2:
                //Update your datas
                break;
            case 3:
                //Log out
                break;
            default:
                //There is no such an option !!!
        }
    }

    public void showAdminMenu() {
        int option = this.scanner.nextInt();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                //Show all users
                break;
            case 2:
                //Kick user
                break;
            case 3:
                //Update your datas
                break;
            default:
                //There is no such an option !!!
        }
    }
}