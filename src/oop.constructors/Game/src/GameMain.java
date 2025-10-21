public class GameMain {
    public static void main(String[] args) {
        Player p1 = new Player("Alice", 20, 1, 1);
        Player p2 = new Player("Bob", 21, 2, 2);

        Game g1 = new Game(); // default
        g1.setId(100);
        g1.setPlayer1(p1);
        g1.setPlayer2(p2);

        Game g2 = new Game(200, p1, p2);

        System.out.println(g1.toString());
        System.out.println(g2.toString());
    }
}
