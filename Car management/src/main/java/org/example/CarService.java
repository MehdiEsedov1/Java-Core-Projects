package main.java.org.example;
import java.util.Scanner;

public class CarService {
    public void addCar() {
        Car car = new Car();

        car.setCarBrand(InputUtil.inputString("Car brand: "));
        car.setCarModel(InputUtil.inputString("Car model: "));
        car.setCarPrice(InputUtil.inputInt("Car price: "));
        car.setID(InputUtil.inputInt("Car ID: "));

        GlobalVariables.cars.add(car);
    }

    public void showCars() {
        for (int i = 0; i < GlobalVariables.cars.size(); i++) {
            Car car = GlobalVariables.cars.get(i);

            System.out.println("\n-------------------------------");
            System.out.println("Car brand: " + car.getCarBrand());
            System.out.println("Car model: " + car.getCarModel());
            System.out.println("Car price: " + car.getCarPrice());
            System.out.println("Car id: " + car.id);
            System.out.println("\n-------------------------------");
        }
    }

    public void searchCar() {
        Scanner scanner = new Scanner(System.in);
        int id = InputUtil.inputInt("Car ID: ");

        for (int i = 0; i < GlobalVariables.cars.size(); i++) {
            if (id == GlobalVariables.cars.get(i).id) {
                Car car = GlobalVariables.cars.get(i);

                System.out.println("\n-------------------------------\n");
                System.out.println("Car brand: " + car.getCarBrand());
                System.out.println("Car model: " + car.getCarModel());
                System.out.println("Car price: " + car.getCarPrice());
                System.out.println("Car id: " + car.id);
                System.out.println("\n-------------------------------");
            }
        }
    }

    public void deleteCar() {
        Scanner scanner = new Scanner(System.in);
        int id = InputUtil.inputInt("Car ID: ");

        for(int i=0; i<GlobalVariables.cars.size(); i++) {
            if (id == GlobalVariables.cars.get(i).id) {
                GlobalVariables.cars.remove(i);
                break;
            }
        }
    }

    public void updateCar() {
        Scanner scanner = new Scanner(System.in);
        int id = InputUtil.inputInt("Car ID: ");

        Car car = new Car();
        car.setCarBrand(InputUtil.inputString("Car brand: "));
        car.setCarModel(InputUtil.inputString("Car model: "));
        car.setCarPrice(InputUtil.inputInt("Car price: "));
        car.setID(id);

        for(int i=0; i<GlobalVariables.cars.size(); i++) {
            if (id == GlobalVariables.cars.get(i).id) {
                GlobalVariables.cars.set(i,car);
            }
        }
    }
}