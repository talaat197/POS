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
public class Mobile implements Product {

    @Override
    public String getCurrentObjectName() {
        return "Mobiles ";
    }

    @Override
    public String getCurrentObjectPrice() {
        return "Prices between 2,000 L.e to 22,000 L.e";    
    }

    @Override
    public String getCurrentObjectQuantity() {
        return "About 300 mobile in stock";
    }
    
}
