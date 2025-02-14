package PatternsCreational.LearningAbstractFactory.factories;

import PatternsCreational.LearningAbstractFactory.buttons.Button;
import PatternsCreational.LearningAbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
