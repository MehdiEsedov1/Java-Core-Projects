package main.java.org.example;

public class Car {
    private String carBrand;
    private String carModel;
    private int carPrice;
    public int id;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarPrice() {
        return this.carPrice;
    }

    public void setID(int id) {
        this.id = id;
    }
}