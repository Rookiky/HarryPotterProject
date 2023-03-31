package Classes;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter@Setter

public abstract class AbstractSpell {

    public int damage;
    public String name;

    public AbstractSpell(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
