package PatternsBahavioral.LearningObserver;

import PatternsBahavioral.LearningObserver.editor.Editor;
import PatternsBahavioral.LearningObserver.listeners.EmailNotificationListener;
import PatternsBahavioral.LearningObserver.listeners.LogOpenListener;

public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open",new LogOpenListener("/path/to/log/file.txt"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.onpeFile("test.txt");
            editor.saveFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
