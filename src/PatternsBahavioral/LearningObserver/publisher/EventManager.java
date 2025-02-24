package PatternsBahavioral.LearningObserver.publisher;

import PatternsBahavioral.LearningObserver.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations){
        for(String operation : operations){
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String evenType,EventListener listener){
        List<EventListener> users = listeners.get(evenType);
        users.add(listener);
    }

    public void unsubscribe(String evenType,EventListener listener){
        List<EventListener> users = listeners.get(evenType);
        users.remove(listener);
    }

    public void notify(String eventType, File file){
        List<EventListener> users = listeners.get(eventType);
        for(EventListener listener : users){
            listener.update(eventType, file);
        }
    }



}
