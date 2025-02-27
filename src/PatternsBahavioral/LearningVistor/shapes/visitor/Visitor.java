package PatternsBahavioral.LearningVistor.shapes.visitor;

import PatternsBahavioral.LearningVistor.shapes.Circle;
import PatternsBahavioral.LearningVistor.shapes.CompoundShape;
import PatternsBahavioral.LearningVistor.shapes.Dot;
import PatternsBahavioral.LearningVistor.shapes.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
