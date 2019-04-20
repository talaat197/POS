/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.util.HashMap;

/**
 *
 * @author Abdo
 */
public class Laptop implements Product{
    
    @Override
    public String getCurrentObjectName() {
        return "Laptops";
    }

    @Override
    public String getCurrentObjectPrice() {
        return "Prices between 5,000 L.e to 70,000 L.e";
    }

    @Override
    public String getCurrentObjectQuantity() {
        return "About 800 Laptop in stock";
    }
    
}
