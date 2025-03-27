package PatternsCreational.Challange.Prototype;

import PatternsCreational.Challange.Prototype.characters.CharacterPlayers;

public class Demo {
    public static void main(String[] args) {


        CharacterPlayers characterPlayers = new CharacterPlayers();
        characterPlayers.hp=20;
        characterPlayers.level=1;
        characterPlayers.name="Player 1";
        characterPlayers.type="Player";
        characterPlayers.setDados("novos dados");
        characterPlayers.setItems("Dragon lore");

        System.out.printf("Character 1: %s\n", characterPlayers.name.getClass().hashCode());

        //SHALOW CLONE
        CharacterPlayers characterPlayers2 = (CharacterPlayers) characterPlayers.shallowClone();
        characterPlayers2.name="Player 2";

        System.out.printf("Character 2: %s\n", characterPlayers2);
        System.out.printf("Character 2: %s\n", characterPlayers2.name.getClass().hashCode());


        //DEEP CLONE
        CharacterPlayers characterPlayers3 = (CharacterPlayers) characterPlayers.deepClone();
        characterPlayers3.name="Player 3";


        System.out.printf("Character 3: %s\n", characterPlayers3.name.getClass().hashCode());
    }
}
