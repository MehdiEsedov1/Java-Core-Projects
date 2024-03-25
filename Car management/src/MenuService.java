import java.util.Scanner;

public class MenuService {
    static CarService carService = new CarService();

    public static void optionSelector(int option) {

        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 0:
                System.exit(-1);
                break;
            case 1:
                carService.addCar();
                break;
            case 2:
                int ID = scanner.nextInt();
                carService.searchCarByID(ID);
                break;
            case 3:
                carService.showCars();
                break;
            case 4:
                carService.updateCar();
                break;
            case 5:
                carService.deleteCar();
                break;
            default:
                throw new AppException(Exceptions.INVALID_OPTION);
        }
    }
}