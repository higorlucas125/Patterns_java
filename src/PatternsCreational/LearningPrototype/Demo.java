package PatternsCreational.LearningPrototype;

import PatternsCreational.LearningPrototype.shapes.Circle;
import PatternsCreational.LearningPrototype.shapes.Rectangle;
import PatternsCreational.LearningPrototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> copyShapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes,copyShapes);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> copyShapes) {
        shapes.stream().forEach(shape -> copyShapes.add(shape.clone()));
        IntStream.range(0,shapes.size()).forEach( i -> {
            if(shapes.get(i) != copyShapes.get(i)){
                System.out.println(i + ": Shapes estão diferentes do objeto (Yay!)");
                System.out.println(i + ((shapes.get(i).equals(copyShapes.get(i)))?" : E ele está identico (yay!)": ": Mas ele não está identico"));
            }else{
                System.out.println(i + ": Shape objeto está o mesmo (boo!) ");
            }
        });

    }
}
