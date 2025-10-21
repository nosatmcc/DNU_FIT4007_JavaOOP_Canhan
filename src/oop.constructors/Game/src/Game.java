public class Game {
    private int id;
    private Player player1;
    private Player player2;

    public Game() {
        id = 0;
        player1 = new Player();
        player2 = new Player();
    }

    public Game(int id, Player player1, Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Player getPlayer1() { return player1; }
    public void setPlayer1(Player player1) { this.player1 = player1; }
    public Player getPlayer2() { return player2; }
    public void setPlayer2(Player player2) { this.player2 = player2; }

    public String toString() {
        return "Game[id=" + id + ", player1=" + player1 + ", player2=" + player2 + "]";
    }
}
