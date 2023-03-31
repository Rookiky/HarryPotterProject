package Classes;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter


public class Enemy extends AbstractEnemy{

    public String name, weakness;
    public int max_hp, current_hp, magic_power;

    public Enemy(String name, int max_hp, int current_hp, int magic_power, String weakness) {
        super(name, max_hp, current_hp, magic_power);
        this.name = name;
        this.current_hp = current_hp;
        this.magic_power = magic_power;
    }

    @Override
    public void attack(Wizard wizard) {

        System.out.println(name + " attacks " + wizard.getName());
        wizard.takeDamage(magic_power);
        System.out.println(wizard.getCurrent_hp());
    }

    public void takeDamage(int magicPower) {
        current_hp -= magicPower;
        System.out.println(name + " takes " + magicPower + " damage");
    }

    public boolean isAlive() {
        return current_hp > 0;
    }

}
