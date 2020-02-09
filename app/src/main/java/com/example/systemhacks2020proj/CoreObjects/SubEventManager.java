package com.example.systemhacks2020proj.CoreObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubEventManager implements Iterable<Event>{

    private ArrayList<Event> subEventList = new ArrayList<>();
    private static SubEventManager instance;
    private SubEvent subevent = new SubEvent();
    private SubEventManager(){
        //Private to prevent anyone else from instantiating.
    }
    public static SubEventManager getInstance(){
        if(instance == null){
            instance = new SubEventManager();
        }
        return instance;
    }

    public int subEventSize(){
        return subEventList.size();
    }

    public void add(Event event) {
        subEventList.add(event);
    }

    public Event getIndex(int i){
        return subEventList.get(i);

    }

    public void remove(int index){
        subEventList.remove(index);
    }

    @Override
    public Iterator<Event> iterator() {
        return subEventList.iterator();
    }

}
