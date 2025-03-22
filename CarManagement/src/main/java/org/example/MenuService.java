package main.java.org.example;

public class MenuService {
    static CarService carService = new CarService();

    public static void optionSelector(int option) {
        switch (option) {
            case 0:
                System.exit(-1);
                break;
            case 1:
                carService.addCar();
                break;
            case 2:
                carService.searchCar();
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