import java.time.LocalDate;
import java.util.Scanner;

public class CarService implements CarServiceIntr {
    public void addCar() {
        if (GlobalValues.carlist == null) {

            int count = InputUtil.inputInt("Give count of new cars :");

            GlobalValues.carlist = new Car[count];

            for (int i = 0; i < count; i++) {
                Car car = new Car();

                car.setCarName(InputUtil.inputString("Car name :"));
                car.setCarModel(InputUtil.inputString("Car model :"));
                car.setCarDate(fillProduction());
                car.setCarPrice(InputUtil.inputInt("Car price :"));
                car.setID(i);

//                GlobalValues.carlist[i].setCarName(InputUtil.inputString("Car name :"));
//                GlobalValues.carlist[i].setCarModel(InputUtil.inputString("Car model :"));
//                GlobalValues.carlist[i].setCarYear(InputUtil.inputInt("Car year :"));
//                GlobalValues.carlist[i].setCarPrice(InputUtil.inputInt("Car price :"));

                GlobalValues.carlist[i] = car;
            }
        } else {
            int count = InputUtil.inputInt("Give count of new cars :");

            Car[] tempCarList = new Car[GlobalValues.carlist.length];

            for (int i = 0; i < GlobalValues.carlist.length; i++) {
                tempCarList[i] = GlobalValues.carlist[i];
            }

            GlobalValues.carlist = new Car[GlobalValues.carlist.length + count];

            for (int i = 0; i < tempCarList.length; i++) {
                GlobalValues.carlist[i] = tempCarList[i];
            }

            for (int i = tempCarList.length; i < tempCarList.length + count; i++) {
                Car car = new Car();

                car.setCarName(InputUtil.inputString("Car name :"));
                car.setCarModel(InputUtil.inputString("Car model :"));
                car.setCarDate(fillProduction());
                car.setCarPrice(InputUtil.inputInt("Car price :"));
                car.setID(i);

//                GlobalValues.carlist[i].setCarName(InputUtil.inputString("Car name :"));
//                GlobalValues.carlist[i].setCarModel(InputUtil.inputString("Car model :"));
//                GlobalValues.carlist[i].setCarYear(InputUtil.inputInt("Car year :"));
//                GlobalValues.carlist[i].setCarPrice(InputUtil.inputInt("Car price :"));

                GlobalValues.carlist[i] = car;
            }
        }
    }

    public void showCars() {
        for (int i = 0; i < GlobalValues.carlist.length; i++) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Car name :" + GlobalValues.carlist[i].getCarName());
            System.out.println("Car model :" + GlobalValues.carlist[i].getCarModel());
            System.out.println("Car year :" + GlobalValues.carlist[i].getCarDate());
            System.out.println("Car price :" + GlobalValues.carlist[i].getCarPrice());
            System.out.println("Car id :" + GlobalValues.carlist[i].id);
            System.out.println("\n-------------------------------");
        }
    }

    public Car searchCarByID(int inputID) {
        for (int i = 0; i < GlobalValues.carlist.length; i++) {
            if (inputID == GlobalValues.carlist[i].id) {
                System.out.println("\n-------------------------------\n");
                System.out.println("Car name :" + GlobalValues.carlist[i].getCarName());
                System.out.println("Car model :" + GlobalValues.carlist[i].getCarModel());
                System.out.println("Car year :" + GlobalValues.carlist[i].getCarDate());
                System.out.println("Car price :" + GlobalValues.carlist[i].getCarPrice());
                System.out.println("Car id :" + GlobalValues.carlist[i].id);
                System.out.println("\n-------------------------------");

                break;
            }
        }
        return GlobalValues.carlist[inputID];
    }

    public LocalDate fillProduction() {
        CharSequence text = InputUtil.inputString("Production year of car :");
        return LocalDate.parse(text);
    }

    public void deleteCar() {
        boolean isDelete = false;
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (id < GlobalValues.carlist.length) {

            Car car = searchCarByID(id);

            Car tempUser[] = GlobalValues.carlist;
            GlobalValues.carlist = new Car[tempUser.length - 1];

            int k = 0;
            for (Car cari : tempUser) {
                if (cari == car) {
                    isDelete = true;
                    continue;
                }

                GlobalValues.carlist[k] = cari;
                k++;
            }
        } else {
            throw new AppException(Exceptions.CAR_NOT_FOUND);
        }
    }

    public void updateCar() {
        int id = InputUtil.inputInt("Give ID of car :");

        Car[] tempCarList = new Car[GlobalValues.carlist.length];

        for (int i = 0; i < GlobalValues.carlist.length; i++) {
            tempCarList[i] = GlobalValues.carlist[i];
        }

        GlobalValues.carlist = new Car[GlobalValues.carlist.length];

        for (int i = 0; i < tempCarList.length; i++) {
            Car car = new Car();
            if (tempCarList[i].id == id) {
                car.setCarName(InputUtil.inputString("Car name :"));
                car.setCarModel(InputUtil.inputString("Car model :"));
                car.setCarDate(fillProduction());
                car.setCarPrice(InputUtil.inputInt("Car price :"));
                car.setID(i);
                GlobalValues.carlist[i] = car;
            } else {
                GlobalValues.carlist[i] = tempCarList[i];
            }
        }
    }
}