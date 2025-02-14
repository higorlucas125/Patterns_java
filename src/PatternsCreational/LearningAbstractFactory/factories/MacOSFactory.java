package PatternsCreational.LearningAbstractFactory.factories;

import PatternsCreational.LearningAbstractFactory.buttons.Button;
import PatternsCreational.LearningAbstractFactory.buttons.MacOSButton;
import PatternsCreational.LearningAbstractFactory.checkboxes.Checkbox;
import PatternsCreational.LearningAbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
