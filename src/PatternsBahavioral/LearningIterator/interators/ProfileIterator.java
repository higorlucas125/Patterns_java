package PatternsBahavioral.LearningIterator.interators;
//Define interface de perfil

import PatternsBahavioral.LearningIterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
