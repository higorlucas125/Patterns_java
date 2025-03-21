package PatternsCreational.Challange.AbstractFactory;

import PatternsCreational.Challange.AbstractFactory.app.Application;
import PatternsCreational.Challange.AbstractFactory.factories.Dark;
import PatternsCreational.Challange.AbstractFactory.factories.Light;
import PatternsCreational.Challange.AbstractFactory.factories.UIFactory;

public class Demo {
    public static void main(String[] args) {

        UIFactory uiFactory = new Dark();
        UIFactory uiFactoryL = new Light();

        Application app = new Application(uiFactory);

        app.render();
    }
}
