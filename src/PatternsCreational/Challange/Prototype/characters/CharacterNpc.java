package PatternsCreational.Challange.Prototype.characters;

public class CharacterNpc  extends Character{
    private double x;
    private double y;
    private double danger;

    public CharacterNpc() {
    }

    public CharacterNpc(CharacterNpc target) {
        super(target);
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.danger = target.danger;
        }
    }


    @Override
    public Character shallowClone() {
        return this;
    }

    @Override
    public Character deepClone() {
        return new CharacterNpc(this);
    }
}
