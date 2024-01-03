import java.util.Objects;
import java.util.Scanner;

public class CustomerRegistration implements ProjectInterface.CustomerRegistration {
    public void signUp() {

        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("Name : ");
        String name = scanner.next();
        customer.setName(name);

        System.out.println("Surname : ");
        String surname = scanner.next();
        customer.setSurname(surname);

        System.out.println("Balance : ");
        int balance = scanner.nextInt();
        customer.setBalance(balance);

        System.out.println("Parol : ");
        int parol = scanner.nextInt();
        customer.setParol(parol);

        menu.showCustomerMenu();

        GlobalValues.currentCustomer = customer;

        GlobalValues.customers.add(customer);
    }

    public void logIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name : ");
        String name = scanner.next();

        System.out.println("Parol : ");
        int parol = scanner.nextInt();

        for (int i = 0; i < GlobalValues.customers.size(); i++) {

            Menu menu = new Menu();

            if (Objects.equals(GlobalValues.customers.get(i).getName(), name) && GlobalValues.customers.get(i).getParol() == parol) {
                menu.showCustomerMenu();
                GlobalValues.currentCustomer = GlobalValues.customers.get(i);
                break;
            }
        }
    }
}