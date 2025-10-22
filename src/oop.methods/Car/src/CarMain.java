public class CarMain {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Camry", 60);
        System.out.println(c);
        System.out.println("Speed in km/h: " + c.getSpeedInKmPerHour());
    }
}
