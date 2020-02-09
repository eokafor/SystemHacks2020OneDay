package com.example.systemhacks2020proj.CoreObjects;

public class EventTextUI {

        public EventTextUI(EventManager manager) {
            //if (manager.eventSize() == 0) {
                manager.add(new Event("Camping", "Aleks Ristic", "Feb 08, 2020", 20.01));
                manager.add(new Event("New Years", "jordan Chong", "Dec 31, 2019", 10.10));
                manager.add(new Event("party", "cj", "june 31, 2019", 12.10));
                manager.add(new Event("skiing", "sami", "july 31, 2019", 9.10));
            //}
        }

}
