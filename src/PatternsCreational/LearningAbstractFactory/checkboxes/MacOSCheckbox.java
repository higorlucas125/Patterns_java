package PatternsCreational.LearningAbstractFactory.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Você foi criado  MacOSCheckbox.");
    }
}
