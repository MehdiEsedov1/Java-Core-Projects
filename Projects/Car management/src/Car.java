import java.time.LocalDate;

public class Car {
    private String carName;
    private String carModel;
    private LocalDate carDate;
    private int carPrice;
    public int id;

    public void setID(int id) {
        this.id = id;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarDate(LocalDate carDate) {
        this.carDate = carDate;
    }

    public LocalDate getCarDate() {
        return this.carDate;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarPrice() {
        return this.carPrice;
    }
}