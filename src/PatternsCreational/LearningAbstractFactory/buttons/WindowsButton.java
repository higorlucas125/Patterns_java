package PatternsCreational.LearningAbstractFactory.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Você foi criado WindowsButton.");
    }
}
