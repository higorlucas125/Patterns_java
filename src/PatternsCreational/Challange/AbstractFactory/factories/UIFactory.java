package PatternsCreational.Challange.AbstractFactory.factories;

import PatternsCreational.Challange.AbstractFactory.buttons.Button;
import PatternsCreational.Challange.AbstractFactory.checkboxes.Checkbox;

public abstract class UIFactory {

    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
