package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialize the wizard of the player and determine the name
        String name = null;
        House house = null;
        Wand wand = null;
        Pet pet = null;
        List<Spell> knownSpells = new ArrayList<>();
        List<Potion> potions = new ArrayList<>();
        List<ForbiddenSpell> forbiddenSpells = new ArrayList<>();


        //creating the wizard of the player
        Wizard MyPlayer = new Wizard(name, 100, 100, 20 , house, knownSpells, potions, wand, pet);

        //setting the house of the player for the adventure
        MyPlayer.setHouse(SortingHat.sortingHat());
        System.out.println(MyPlayer.getHouse());


        //setting the wand for the player
        int size = 0;
        Core core = null;
        Wand MyWand = new Wand(size, core);//core ne marche pas
        MyWand.setCore(Core.randomComponent());
        MyWand.setSize(Wand.size());
        MyPlayer.setWand(MyWand);
        System.out.println(MyWand.getCore() + "\n" + MyWand.getSize());


        //set le pet de compagnie du joueur
        MyPlayer.setPet(Pet.choosePet());
        System.out.println(MyPlayer.getPet());


        //setting the known spells for the player
        MyPlayer.setKnownSpells(knownSpells);

        //initialize the spells for the whole story
        Spell spell1 = new Spell("Wingardium Leviosa", 100);
        Spell spell2 = new Spell("Gryffindor Sword", 100);
        Spell spell3 = new Spell("Accio", 100);
        Spell spell4 = new Spell("Expecto Patronum", 100);
        Spell spell5 = new Spell("FireWorks", 100);
        Spell spell6 = new Spell("Sectumsempra", 100);
        Spell spell7 = new Spell("Expelliarmus", 100);

        ForbiddenSpell forbiddenSpell1 = new ForbiddenSpell("Avada Kedavra", 40);


        //set pots for the player
        Potion potion1 = new Potion( 5, 40);
        potions.add(potion1);

        GameLogic.anythingToContinue();

        //Level 1
        Enemy troll = new Enemy("Troll", 100, 100, 20, "Wingardium Leviosa");

        knownSpells.add(spell1);
        forbiddenSpells.add(forbiddenSpell1);


        System.out.println("you are fighting the " + troll.getName());
        Combat.startCombatEnemy(MyPlayer, troll);

        GameLogic.anythingToContinue();



        //Level 2
        //faire boucle if pour ajouter soit épée de griffondor ou crocs du basilic avec Accio
        Enemy basilic = new Enemy("Basilic", 100, 100, 30, "Gryffindor Sword");
        if(MyPlayer.getHouse().toString() == "Gryffindor") {
            knownSpells.add(spell2);
        } else {
            knownSpells.add(spell3);
        }

        System.out.println("You are fighting the " + basilic.getName());

        Combat.startCombatEnemy(MyPlayer, basilic);

        GameLogic.anythingToContinue();

        //Level 3
        Enemy detraqueurs = new Enemy("Detraqueurs", 100, 100, 30, "Expecto Patronum");

        knownSpells.add(spell4);

        System.out.println("You are fighting the:" + detraqueurs.getName());

        Combat.startCombatEnemy(MyPlayer, detraqueurs);

        GameLogic.anythingToContinue();

        //Level 4
        Boss voldemort = new Boss("Voldemort", 100, 100, 30, "Accio", forbiddenSpells);

        System.out.println("You are fighting the:" + voldemort.getName());

        Combat.startCombat(MyPlayer, voldemort);

        GameLogic.anythingToContinue();

        //Level 5
        Enemy dolores = new Enemy("Dolores", 100, 100, 30, "FireWorks");

        System.out.println("You are fighting the:" + dolores.getName());

        Combat.startCombatEnemy(MyPlayer, dolores);

        GameLogic.anythingToContinue();

        //Level 6
        Boss mangemorts = new Boss("Mangemorts", 100, 100, 30, "Sectumsempra", forbiddenSpells);

        System.out.println("You are fighting the:" + mangemorts.getName());

        Combat.startCombat(MyPlayer, mangemorts);

        GameLogic.anythingToContinue();

        //Level 7
        Boss bellatrix = new Boss("Bellatrix", 100, 100, 30, "Expelliarmus", forbiddenSpells);

        System.out.println("You are fighting the:" + bellatrix.getName());
        Combat.startCombat(MyPlayer, bellatrix);

        GameLogic.anythingToContinue();

        System.out.println("You are fighting the:" + voldemort.getName());
        Combat.startCombat(MyPlayer, voldemort);

        GameLogic.anythingToContinue();

    }
}