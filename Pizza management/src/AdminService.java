import java.util.Scanner;

public class AdminService implements ProjectInterface.AdminService {
    public void addCourier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count of new couriers : ");
        int countOfCouriers = scanner.nextInt();

        for (int i = 0; i < countOfCouriers; i++) {
            Courier courier = new Courier();

            System.out.println("Name of courier : ");
            String nameOfCourier = scanner.next();
            courier.setName(nameOfCourier);

            System.out.println("Telephone of courier");
            String telephoneOfcourier = scanner.next();
            courier.setTelNumber(telephoneOfcourier);

            System.out.println("Car of courier");
            String carOfcourier = scanner.next();
            courier.setCar(carOfcourier);

            System.out.println("Car number of courier");
            String carNumberOfCourier = scanner.next();
            courier.setCar(carNumberOfCourier);

            GlobalValues.couriers.add(courier);
        }
    }

    public void viewCourier() {
        for (int i = 0; i < GlobalValues.couriers.size(); i++) {
            System.out.println("-------------------");
            System.out.println("Name of courier : " + GlobalValues.couriers.get(i).getName());
            System.out.println("Car of courier : " + GlobalValues.couriers.get(i).getCar());
            System.out.println("Car number of courier : " + GlobalValues.couriers.get(i).getCarNumber());
            System.out.println("Telephone number of courier : " + GlobalValues.couriers.get(i).getTelNumber());
            System.out.println("-------------------");
        }
    }

    public void viewCustomers() {
        for (int i = 0; i < GlobalValues.couriers.size(); i++) {
            System.out.println("-------------------");
            System.out.println("Name of customer : " + GlobalValues.customers.get(i).getName());
            System.out.println("Surname of customer : " + GlobalValues.customers.get(i).getSurname());
            System.out.println("Age number of customer : " + GlobalValues.customers.get(i).getBalance());
            System.out.println("-------------------");
        }
    }
}