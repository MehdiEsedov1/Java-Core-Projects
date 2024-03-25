import java.time.LocalDate;

public interface CarServiceIntr {
    void addCar();

    void deleteCar();

    Car searchCarByID(int inputID);

    void showCars();

    LocalDate fillProduction();
}
