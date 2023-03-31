package Classes;

public abstract class AbstractEnemy extends Character{

    public AbstractEnemy(String name, int max_hp, int current_hp, int magic_power) {
        super(name, max_hp, current_hp, magic_power);
    }

    public abstract void attack(Wizard wizard);


}
