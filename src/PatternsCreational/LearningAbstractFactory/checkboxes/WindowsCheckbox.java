package PatternsCreational.LearningAbstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Você foi criado WindowsCheckbox.");
    }
}
