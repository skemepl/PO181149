package base;

import derived.Armor;
import derived.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Fighter {
    private Armor armor;
    private List<Weapon> weapons = new ArrayList<>();

    public List<Weapon> getWeapons() {
        return new ArrayList<>(weapons);
    }
    public void setWeapons(List<Weapon> weapons) {
        this.weapons = new ArrayList<>(weapons);
    }
    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public void useEq() {
        if(armor!=null){
            armor.use();
        }
        for (Weapon weapon : weapons) {
            weapon.use();
        }
    }
}
