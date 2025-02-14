package PatternsCreational.LearningAbstractFactory.app;

import PatternsCreational.LearningAbstractFactory.buttons.Button;
import PatternsCreational.LearningAbstractFactory.checkboxes.Checkbox;
import PatternsCreational.LearningAbstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
