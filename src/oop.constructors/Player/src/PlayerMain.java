public class PlayerMain {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("PlayerA");
        p1.setAge(18);
        p1.setPositionX(10);
        p1.setPositionY(20);

        Player p2 = new Player("PlayerB", 22, 5, 7);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
