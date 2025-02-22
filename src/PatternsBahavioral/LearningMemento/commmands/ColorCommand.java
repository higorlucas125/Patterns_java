package PatternsBahavioral.LearningMemento.commmands;

import PatternsBahavioral.LearningMemento.editor.Editor;
import PatternsBahavioral.LearningMemento.shapes.Shape;
import java.awt.*;

public class ColorCommand implements Command{
    private Editor editor;
    private Color color;


    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
