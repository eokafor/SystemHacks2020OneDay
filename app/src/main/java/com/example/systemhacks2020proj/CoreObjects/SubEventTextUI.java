package com.example.systemhacks2020proj.CoreObjects;

public class SubEventTextUI {

    public SubEventTextUI(SubEventManager manager) {
        manager.add(new Event("Cups", "Aleks Ristic", "Feb 08, 2020", 20.01));
        manager.add(new Event("Beer", "jordan Chong", "Dec 31, 2019", 10.10));
        manager.add(new Event("Chairs", "cj", "june 31, 2019", 12.10));
        manager.add(new Event("Balls", "sami", "july 31, 2019", 9.10));

    }
}