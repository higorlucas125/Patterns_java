package PatternsBahavioral.LearningState;

import PatternsBahavioral.LearningState.ui.Player;
import PatternsBahavioral.LearningState.ui.UI;

public class Demo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
