package PatternsCreational.Challange.AbstractFactory.factories;

import PatternsCreational.Challange.AbstractFactory.buttons.Button;
import PatternsCreational.Challange.AbstractFactory.buttons.LightButton;
import PatternsCreational.Challange.AbstractFactory.checkboxes.Checkbox;
import PatternsCreational.Challange.AbstractFactory.checkboxes.LightCheckbox;

public class Light extends UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
