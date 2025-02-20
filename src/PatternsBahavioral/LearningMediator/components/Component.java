package PatternsBahavioral.LearningMediator.components;

import PatternsBahavioral.LearningMediator.mediator.Mediator;

//Classes Colegas
public interface Component {

    void setMediator(Mediator mediator);
    String getName();
}
