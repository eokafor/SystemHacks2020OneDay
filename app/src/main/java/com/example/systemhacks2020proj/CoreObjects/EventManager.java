package com.example.systemhacks2020proj.CoreObjects;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;

import com.example.systemhacks2020proj.R;
import com.example.systemhacks2020proj.SubEvents;

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

    public void add(Event event) {
        eventList.add(event);
    }

    public Event getIndex(int i){
        return eventList.get(i);

    }

    public void remove(int index){
        eventList.remove(index);
    }

    @Override
    public Iterator<Event> iterator() {
        return eventList.iterator();
    }





}
