package PatternsCreational.Challange.AbstractFactory.factories;

import PatternsCreational.Challange.AbstractFactory.buttons.Button;
import PatternsCreational.Challange.AbstractFactory.buttons.DarkButton;
import PatternsCreational.Challange.AbstractFactory.checkboxes.Checkbox;
import PatternsCreational.Challange.AbstractFactory.checkboxes.DarkCheckbox;

public class Dark extends UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
