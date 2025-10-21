public class Player {
    private String name;
    private int age;
    private int positionX;
    private int positionY;

    public Player() {
        name = "";
        age = 0;
        positionX = 0;
        positionY = 0;
    }

    public Player(String name, int age, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    public String toString() {
        return "Player[name=" + name + ", age=" + age + ", positionX=" + positionX + ", positionY=" + positionY + "]";
    }
}
