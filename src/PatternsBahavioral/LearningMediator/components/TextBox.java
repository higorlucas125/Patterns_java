package PatternsBahavioral.LearningMediator.components;

import PatternsBahavioral.LearningMediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
