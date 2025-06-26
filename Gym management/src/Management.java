import java.util.Scanner;

public class Management {
    public static void showMenu() {
        System.out.printf("----------| Gym Management System |----------\n" +
                "[0]--> exit\n" +
                "[1]--> Register gym member\n" +
                "[2]--> Show all members\n" +
                "[3]--> Enter the gym\n" +
                "[4]--> Update departures\n" +
                "---------------------------------------------\n" +
                "Your option : "
        );
    }

    public static void allServices() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        Services services = new Services();
        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                services.register();
                break;
            case 2:
                services.showAllMembers();
                break;
            case 3:
                services.enterGYM();
                break;
            case 4:
                services.updateDepartures();
        }
    }
}
