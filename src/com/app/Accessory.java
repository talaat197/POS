/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author Abdo
 */
public class Accessory implements Product {

    @Override
    public String getCurrentObjectName() {
        return "Accessories";
    }

    @Override
    public String getCurrentObjectPrice() {
        return "Prices between 100 L.e to 1,700 L.e";
    }

    @Override
    public String getCurrentObjectQuantity() {
        return "About 1500 piece in stock";     
    }
    
}
