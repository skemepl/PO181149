import base.Fighter;
import derived.Armor;
import derived.Weapon;

import java.util.ArrayList;
import java.util.List;

public class TestFighter {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();

        Weapon sword = new Weapon("Excalibur", 50);
        Weapon axe = new Weapon("Toporek", 20);
        Armor armor = new Armor("Zbroja armii czerwonej", 70);

        List<Weapon> weaponList =  new ArrayList<>();
        weaponList.add(sword);
        weaponList.add(axe);

        fighter.setWeapons(weaponList);
        fighter.setArmor(armor);

        System.out.println("Wyposażenie:");
        fighter.useEq();

        List<Weapon> external = fighter.getWeapons();
        external.remove(0);

        System.out.println("Po próbie modyfikacji:");
        fighter.useEq();
    }
}
