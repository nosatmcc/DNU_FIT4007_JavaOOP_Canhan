public class PlayerMain {
    public static void main(String[] args) {
        Player p = new Player("Alex", 20, 95, 10, 5);
        System.out.println(p);
        p.increaseScore(10);
        System.out.println("After +10 score: " + p.getScore());
        System.out.println("Is Winner? " + p.isWinner());
    }
}
