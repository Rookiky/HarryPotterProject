package Classes;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter@Setter
public class Spell extends AbstractSpell {
    public String name;

    public Spell(String name, int damage) {
        super(name, damage);
        this.name = name;
    }




}
