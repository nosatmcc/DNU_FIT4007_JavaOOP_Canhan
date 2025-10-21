public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Model X");
        car1.setColor("White");
        car1.setSeatingCapacity(5);
        car1.setYear(2022);

        Car car2 = new Car("Red", "Fiesta", 4, 2018);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
