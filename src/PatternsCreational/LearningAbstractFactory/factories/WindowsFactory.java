package PatternsCreational.LearningAbstractFactory.factories;

import PatternsCreational.LearningAbstractFactory.buttons.Button;
import PatternsCreational.LearningAbstractFactory.buttons.WindowsButton;
import PatternsCreational.LearningAbstractFactory.checkboxes.Checkbox;
import PatternsCreational.LearningAbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
