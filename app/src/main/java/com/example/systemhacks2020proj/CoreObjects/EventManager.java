package com.example.systemhacks2020proj.CoreObjects;
import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class EventManager implements Iterable<Event>{

    private List<Event> eventList = new ArrayList<>();
    private static EventManager instance;
    private EventManager(){
        //Private to prevent anyone else from instantiating.
    }
    public static EventManager getInstance(){
        if(instance == null){
            instance = new EventManager();
        }
        return instance;
    }

    public int eventSize(){
        return eventList.size();
    }
    @Override
    public Iterator<Event> iterator() {
        return null;
    }
}
