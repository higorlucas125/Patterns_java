package PatternsCreational.Challange.Prototype.characters;

import java.util.Objects;

public abstract class Character {

    public int level;
    public int hp;
    public String name;
    public String type;

    public Character() {
    }

    public Character(Character character) {
        if(character != null){
            this.level = character.level;
            this.hp = character.hp;
            this.name = character.name;
            this.type = character.type;
        }
    }

    public abstract Character shallowClone();
    public abstract Character deepClone();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;
        return level == character.level && hp == character.hp && Objects.equals(name, character.name) && Objects.equals(type, character.type);
    }

}
