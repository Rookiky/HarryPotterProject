package Classes;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter@Setter

public class ForbiddenSpell extends AbstractSpell {

    public String name;
    public int damage;

    public ForbiddenSpell(String name, int damage) {
        super(name, damage);
        this.name = name;
        this.damage = damage;
    }
}
