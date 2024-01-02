import java.nio.MappedByteBuffer;
import java.util.Scanner;

public class MenuSelector implements ProjectInterface.MenuSelector {
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        Menu menu = new Menu();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                menu.showAdminMenu();
                break;
            case 2:
                menu.showCustomerRegistrationMenu();
                break;
        }
    }

    public void adminMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        AdminService adminService = new AdminService();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1: //back();
                break;
            case 2:
                adminService.addCourier();
                break;
            case 3: //trackOrders();
                break;
            case 4:
                adminService.viewCourier();
                break;
            case 5:
                adminService.viewCustomers();
                break;
        }
    }

    public void customerRegistrationMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        CustomerRegistration customerRegistration = new CustomerRegistration();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                customerRegistration.logIn();
                break;
            case 2:
                customerRegistration.signUp();
                break;
            case 3: //back();
                break;
        }
    }

    public void customerMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        OrderService orderService = new OrderService();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1: //back();
                break;
            case 2:
                orderService.order();
                break;
            case 3: //trackOrders();
                break;
            case 4: //cancelOrder();
                break;
        }
    }
}