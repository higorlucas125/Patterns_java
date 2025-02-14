package PatternsStructural.LearningComposite;

import PatternsStructural.LearningComposite.editor.ImageEditor;
import PatternsStructural.LearningComposite.shapes.Circle;
import PatternsStructural.LearningComposite.shapes.CompoundShape;
import PatternsStructural.LearningComposite.shapes.Dot;
import PatternsStructural.LearningComposite.shapes.Rectangle;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10,10,10, Color.blue),
                new CompoundShape(
                        new Circle(110,100,50, Color.RED),
                        new Dot(160,160,Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250,250,100,100,Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
