package PatternsCreational.LearningAbstractFactory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Você foi criado MacOsButton.");
    }
}
