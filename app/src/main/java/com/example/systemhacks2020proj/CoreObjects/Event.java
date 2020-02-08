package com.example.systemhacks2020proj.CoreObjects;

public class Event {
    private String eventName;
    private String creator;
    private String date;
    private double moneyOwed;

    //constructor
    public Event(String eventName, String creator, String date, double moneyOwed) {
        this.eventName = eventName;
        this.creator = creator;
        this.date = date;
        this.moneyOwed = moneyOwed;
    }

    //getters and setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoneyOwed() {
        return moneyOwed;
    }

    public void setMoneyOwed(double moneyOwed) {
        this.moneyOwed = moneyOwed;
    }


}
