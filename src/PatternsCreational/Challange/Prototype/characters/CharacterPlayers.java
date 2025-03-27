package PatternsCreational.Challange.Prototype.characters;

public class CharacterPlayers extends Character{
    private String items;
    private String dados;

    public CharacterPlayers() {
    }

    public CharacterPlayers(CharacterPlayers target) {
        super(target);
        if(target != null){
            this.items = target.items;
            this.dados = target.dados;
        }
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    @Override
    public Character shallowClone() {
        return this;
    }

    @Override
    public Character deepClone() {
        return new CharacterPlayers(this);
    }
}
