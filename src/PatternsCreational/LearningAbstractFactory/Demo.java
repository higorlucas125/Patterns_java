package PatternsCreational.LearningAbstractFactory;

import PatternsCreational.LearningAbstractFactory.app.Application;
import PatternsCreational.LearningAbstractFactory.factories.GUIFactory;
import PatternsCreational.LearningAbstractFactory.factories.MacOSFactory;
import PatternsCreational.LearningAbstractFactory.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        factory = (osName.contains("linux"))? new MacOSFactory() : new WindowsFactory();

        app = new Application(factory);
        return  app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
