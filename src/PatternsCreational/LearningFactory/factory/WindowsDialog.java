package PatternsCreational.LearningFactory.factory;

import PatternsCreational.LearningFactory.button.Button;
import PatternsCreational.LearningFactory.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
