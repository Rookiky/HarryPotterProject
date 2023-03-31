package Classes;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.lang.Math;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class Wizard extends Character {

    public List<Spell> knownSpells;
    public List<Potion> potions;
    public House house;

    public Pet pet;
    public Wand wand;
    public int current_hp;
    public String name;

    public Wizard(String name, int max_hp, int current_hp, int magic_power, House house, List<Spell> knownSpells,  List<Potion> potions, Wand wand, Pet pet) {
        super(name, max_hp, current_hp, magic_power);
        this.current_hp = current_hp;
        this.name = name;
        this.knownSpells = knownSpells;
        this.potions = potions;
        chooseName();
    }




    public void castSpell(Spell spell, Boss boss) {
        int proba = attackProbability();
        if(proba >33 && spell.getName() == boss.getWeakness()) {
            System.out.println(name + " casts " + spell.getName() + " at " + boss.getName());
            boss.setCurrent_hp(0);
        } else {
            System.out.println(proba);
            System.out.println("you missed the spell");

        }
    }

    public void castSpellEnemy(Spell spell, Enemy enemy) {
        int proba = attackProbability();
        if(proba >33) {
            System.out.println(name + " casts " + spell.getName() + " at " + enemy.getName());
            enemy.takeDamage(spell.getDamage());
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


    public int defend() {
        return 0;
    }





    public String chooseName() {
        GameLogic.clearConsole();
        boolean input = false;
        do {
            Scanner playerName = new Scanner(System.in);
            System.out.println("Hello new player in this new world, choose a name for your wizard:");
            String selectedName= playerName.nextLine();

            switch (selectedName) {
                case "":
                    break;
                default:
                    input = true;
                    this.name = selectedName;
                    break;
            }
        } while(input == false);

        System.out.println("Welcome in this lore " + name);
        GameLogic.anythingToContinue();
        return name;
    }


    public void takeDamage(int magicPower) {
        current_hp -= magicPower;
        System.out.println(name + " takes " + magicPower + " damage");
    }

    public void takeHeal(int heal) {
            current_hp += heal;
            System.out.println(name + " has now " + current_hp + "hp");
    }
    public boolean isAlive() {
        return current_hp > 0;
    }
}

