package Classes;

public abstract class Character {

    public int max_hp, current_hp, magic_power;
    public String name;
    public Character(String name, int max_hp, int current_hp, int magic_power) {
        this.name = name;
        this.max_hp = max_hp;
        this.current_hp = current_hp;
        this.magic_power = magic_power;
    }



}
