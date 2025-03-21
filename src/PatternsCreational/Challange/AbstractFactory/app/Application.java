package PatternsCreational.Challange.AbstractFactory.app;

import PatternsCreational.Challange.AbstractFactory.buttons.Button;
import PatternsCreational.Challange.AbstractFactory.checkboxes.Checkbox;
import PatternsCreational.Challange.AbstractFactory.factories.UIFactory;


public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckbox();
    }

    public void render(){
        button.render();
        checkbox.render();
    }
}
