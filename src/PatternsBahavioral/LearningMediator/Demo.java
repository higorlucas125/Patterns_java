package PatternsBahavioral.LearningMediator;

import PatternsBahavioral.LearningMediator.components.*;
import PatternsBahavioral.LearningMediator.mediator.Editor;
import PatternsBahavioral.LearningMediator.mediator.Mediator;

import javax.swing.*;

public class Demo {

    public static void main(String[] args) {
        Mediator mediator = new Editor();
        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
