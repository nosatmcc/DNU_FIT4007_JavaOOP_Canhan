public class GameMain {
    public static void main(String[] args) {
        Player p1 = new Player("Alex", 20, 120, 0, 0);
        Player p2 = new Player("Bob", 22, 90, 5, 5);
        Game g = new Game(1, p1, p2);

        System.out.println(g);
        System.out.println("Winner: " + (g.getWinner() != null ? g.getWinner().getName() : "No one"));
        g.resetGame();
        System.out.println("After reset: " + g);
        g.swapPlayers();
        System.out.println("After swap: " + g);
    }
}
