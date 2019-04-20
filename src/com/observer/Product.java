package com.observer;

public class Product implements Observer {
    private  String Name;

    public Product(String name){
        this.Name = name;
    }

    @Override
    public void PrintInvoice(String message) {
        System.out.printf("%s added to %s%n", this.Name , message );
    }
}
