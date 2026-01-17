package derived;

import base.Item;

public class Armor extends Item {
    private int defense;

    public Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public void use() {
        System.out.println("Używana zbroja: " + name + " (Ochrona: " + defense + ")");
    }
}
