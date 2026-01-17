package base;

public class Game {
    protected String title;
    protected int maxPlayers;

    public Game(String title, int maxPlayers) {
        this.title = title;
        this.maxPlayers = maxPlayers;
        initialize();
    }
    public void initialize() {
        System.out.println("Inicializacja gry: " + title + " dla " + maxPlayers + " graczy.");
    }
}
