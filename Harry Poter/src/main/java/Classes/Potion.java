package Classes;

import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class Potion {

    private int amount;
    private int heal;


    public Potion(int amount, int heal) {
        this.amount = amount;
        this.heal = heal;
    }


    public void heal(Wizard wizard) {
        System.out.println("potions heal " + wizard.getName() + " for " + heal + "hp");
        wizard.takeHeal(heal);
        amount -= 1;
        System.out.println("You have now " + amount + " potions left");
        System.out.println(wizard.getCurrent_hp());

    }


}


