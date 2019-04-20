package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {
    String ID;
    String availability;
    private List<Observer> observerList;
    public Order(String id) {
        this.ID = id;
        observerList=  new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllItems() {
        for (Observer observer : observerList) {
            observer.PrintInvoice(availability);
        }
    }

    public void setAvailability(boolean available)
    {
       this.availability =  available ? "added to order " : " not available";
       notifyAllItems();
    }
}
