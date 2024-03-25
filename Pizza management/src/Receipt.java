public class Receipt {
    private String pizza;
    private String size;
    private String sous;

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getCourierPhoneNumber() {
        return courierPhoneNumber;
    }

    public void setCourierPhoneNumber(String courierPhoneNumber) {
        this.courierPhoneNumber = courierPhoneNumber;
    }

    public String getCourierVehicleType() {
        return courierVehicleType;
    }

    public void setCourierVehicleType(String courierVehicleType) {
        this.courierVehicleType = courierVehicleType;
    }

    public String getCourierVehiclePlate() {
        return courierVehiclePlate;
    }

    public void setCourierVehiclePlate(String courierVehiclePlate) {
        this.courierVehiclePlate = courierVehiclePlate;
    }

    private int price;
    private String courierName;
    private String courierPhoneNumber;
    private String courierVehicleType;
    private String courierVehiclePlate;
}