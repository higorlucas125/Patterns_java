package PatternsBahavioral.LearningMediator.mediator;

import PatternsBahavioral.LearningMediator.components.Component;

import javax.swing.*;

//Define a interface comum do mediador
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
