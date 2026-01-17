package derived;

import base.Item;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void use() {
        System.out.println("Używana broń: " + name + " (Obrażenia: " + damage + ")");
    }
}
