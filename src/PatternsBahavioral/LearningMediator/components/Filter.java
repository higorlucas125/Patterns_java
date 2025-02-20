package PatternsBahavioral.LearningMediator.components;

import PatternsBahavioral.LearningMediator.mediator.Mediator;
import PatternsBahavioral.LearningMediator.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    private Mediator mediator;
    private ListModel listModel;

    public Filter(){}

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent){
        String start = getText();
        searchElements(start);
    }

    public void setList(ListModel listModel){
        this.listModel = listModel;
    }

    private void searchElements(String s ){
        if( listModel == null ){
            return;
        }

        if(s.equals("")){
            mediator.setElementsList(listModel);
            return;
        }
        ArrayList<Note> notes = new ArrayList<Note>();
        for(int i = 0; i< listModel.getSize();i++){
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<Note>();

        for(Note note: notes){
            if(note.getName().contains(s)){
                listModel.addElement(note);
            }
        }

        mediator.setElementsList(listModel);
    }

    @Override
    public String getName(){
        return "Filter";
    }
}
