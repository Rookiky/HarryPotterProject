package Classes;
import java.util.Scanner;
import java.util.List;
public class Combat {

    private  Wizard wizard;

    private  Boss boss;

    private static Scanner scanner;



    public static void startCombat(Wizard wizard, Boss boss) {
        scanner = new Scanner(System.in);
        System.out.println("You are fighting :" + boss.getName());

        while(wizard.getCurrent_hp()>0 && boss.getCurrent_hp()>0) {
            System.out.println("choose a Spell to cast:");
            List<Spell> knownSpells = wizard.getKnownSpells();
            for(int i=0; i<knownSpells.size(); i++) {
                Spell spell = knownSpells.get(i);
                System.out.println((i +1 ) + ". " + spell.getName());
            }
            int spellIndex = scanner.nextInt() - 1;
            Spell spell = knownSpells.get(spellIndex);
            wizard.castSpell(spell, boss);

            Scanner healChoice = new Scanner(System.in);
            System.out.println("Would you like to use a potion: Yes or No ");
            String selectHealChoice = healChoice.nextLine();
            boolean condition = false;
            switch(selectHealChoice) {
                case "Yes":
                    List<Potion> potions = wizard.getPotions();
                    for(int i = 0; i<potions.size(); i++) {
                        Potion potion = potions.get(i);
                        System.out.println((i+1) +  " .potions: " + potion.getAmount());
                    }
                    int potionIndex = scanner.nextInt() - 1;
                    Potion potion = potions.get(potionIndex);
                    potion.heal(wizard);
                    condition = true;
                    break;
                case "No":
                    condition = true;
                    break;
                default:
                    System.out.println("wrong Choice");
                    break;
            }

            //boss attack
            if (boss.isAlive()) {
                boss.attack(wizard);
                System.out.println(boss.getName() + " is casting: " + boss.getForbiddenSpells());
                List<ForbiddenSpell> forbiddenSpells = boss.getForbiddenSpells();
                ForbiddenSpell forbiddenSpell = forbiddenSpells.get(0);
                boss.castSpell(forbiddenSpell, wizard);
            }
        }
        System.out.println("would you like to improve your hp max?");



    }

    public static void startCombatEnemy(Wizard wizard, Enemy enemy) {
        scanner = new Scanner(System.in);
        System.out.println("You are fighting :" + enemy.getName());

        while(wizard.getCurrent_hp()>0 && enemy.getCurrent_hp()>0) {
            System.out.println("choose a Spell to cast:");
            List<Spell> knownSpells = wizard.getKnownSpells();
            for(int i=0; i<knownSpells.size(); i++) {
                Spell spell = knownSpells.get(i);
                System.out.println((i +1 ) + ". " + spell.getName());
            }
            int spellIndex = scanner.nextInt() - 1;
            Spell spell = knownSpells.get(spellIndex);
            wizard.castSpellEnemy(spell, enemy);

            Scanner healChoice = new Scanner(System.in);
            System.out.println("Would you like to use a potion: Yes or No ");
            String selectHealChoice = healChoice.nextLine();
            boolean condition = false;
            switch(selectHealChoice) {
                case "Yes":
                    List<Potion> potions = wizard.getPotions();
                    for(int i = 0; i<potions.size(); i++) {
                        Potion potion = potions.get(i);
                        System.out.println((i+1) +  " .potions: " + potion.getAmount());
                    }
                    int potionIndex = scanner.nextInt() - 1;
                    Potion potion = potions.get(potionIndex);
                    potion.heal(wizard);
                    condition = true;
                    break;
                case "No":
                    condition = true;
                    break;
                default:
                    System.out.println("wrong Choice");
                    break;
            }

            //boss attack
            if (enemy.isAlive()) {
                enemy.attack(wizard);
            }
        }


        Scanner increaseHp = new Scanner(System.in);
        String selectIncreaseHp = increaseHp.nextLine();
        boolean condition = false;
        switch(selectIncreaseHp) {
            case "Yes":
                wizard.max_hp += 10;
                condition = true;
                break;
            case "No":
                condition = true;
                break;
            default:
                System.out.println("wrong Choice");
                break;
        }
    }
}
