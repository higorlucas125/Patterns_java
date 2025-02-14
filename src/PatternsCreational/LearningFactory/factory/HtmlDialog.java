package PatternsCreational.LearningFactory.factory;

import PatternsCreational.LearningFactory.button.Button;
import PatternsCreational.LearningFactory.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
