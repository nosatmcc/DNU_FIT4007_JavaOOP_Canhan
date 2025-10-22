public class Car {
    private String brand;
    private String model;
    private double speed;

    public Car() {}

    public Car(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeedInKmPerHour() {
        return speed * 1.60934;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", speed=" + speed + " mph}";
    }
}
