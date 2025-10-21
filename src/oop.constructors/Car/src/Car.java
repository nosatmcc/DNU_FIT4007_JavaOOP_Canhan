public class Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;

    public Car() {
        color = "";
        name = "";
        seatingCapacity = 0;
        year = 0;
    }

    public Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getSeatingCapacity() { return seatingCapacity; }
    public void setSeatingCapacity(int seatingCapacity) { this.seatingCapacity = seatingCapacity; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String toString() {
        return "Car[color=" + color + ", name=" + name + ", seatingCapacity=" + seatingCapacity + ", year=" + year + "]";
    }
}
