package Classes;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class Boss extends AbstractEnemy{

    public String weakness;
    public List<ForbiddenSpell> forbiddenSpells;
    public int current_hp;
    public String name;
    public Boss(String name, int max_hp, int current_hp, int magic_power, String weakness, List<ForbiddenSpell> forbiddenSpells) {
        super(name, max_hp, current_hp, magic_power);
        this.weakness = weakness;
        this.current_hp = current_hp;
        this.name = name;
        this.forbiddenSpells = forbiddenSpells;
    }

    @Override
    public void attack(Wizard wizard) {

        System.out.println(name + " attacks " + wizard.getName());
        wizard.takeDamage(magic_power);
        System.out.println(wizard.getCurrent_hp());
    }

    public void castSpell(ForbiddenSpell forbiddenSpells, Wizard wizard) {
        int proba = attackProbability();
        if(proba >10) {
            System.out.println(name + " casts " + forbiddenSpells.getName() + " at " + wizard.getName());
            wizard.takeDamage(forbiddenSpells.getDamage());
        } else {
            System.out.println(proba);
            System.out.println("you missed the spell");

        }
    }

    public int attackProbability() {
        int min = 0;
        int max = 101;
        int probability = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(probability);
        return probability;
    }


    public boolean isAlive() {
        return current_hp >0;
    }
}

