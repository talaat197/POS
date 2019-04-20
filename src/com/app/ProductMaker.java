/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author tmt
 */
public class ProductMaker {
    Product Mobile;
    Product Labtop;
    Product Accessory;
    
    public ProductMaker()
    {
        Mobile  = new Mobile();
        Labtop = new Laptop();
        Accessory = new Accessory();
    }
    
    public void orderLaptop()
    {
        System.out.println("Ordered 1 " + Labtop.getCurrentObjectName());
        System.out.println("Price : " + Labtop.getCurrentObjectPrice());

    }
    public void orderMobile()
    {
        System.out.println("Ordered 1 " + Mobile.getCurrentObjectName());
        System.out.println("Price : " + Mobile.getCurrentObjectPrice());

    }
    public void orderAccessory()
    {
        System.out.println("Ordered 1 " + Accessory.getCurrentObjectName());
        System.out.println("Price : " + Accessory.getCurrentObjectPrice());

    }
    
}
