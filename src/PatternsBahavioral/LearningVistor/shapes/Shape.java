package PatternsBahavioral.LearningVistor.shapes;

import PatternsBahavioral.LearningVistor.shapes.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
