package derived;

import base.Game;

public class RPG extends Game {
    private String worldName;

    public RPG(String title, int maxPlayers, String worldName) {
        super(title, maxPlayers);
        this.worldName = worldName;
        System.out.println("Świat: " + worldName + " jest gotowy!");
    }
}
