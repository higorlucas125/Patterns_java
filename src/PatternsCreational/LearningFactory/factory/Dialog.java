package PatternsCreational.LearningFactory.factory;

import PatternsCreational.LearningFactory.button.Button;


public abstract class Dialog {
    public void renderWindow(){

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
