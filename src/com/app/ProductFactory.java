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
public class ProductFactory {
   
    public static Product ProductGenerator(String productType){
        if(productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("Mobile")){
            return new Mobile();
        }
        if(productType.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        if(productType.equalsIgnoreCase("accessories")){
            return new Accessory();
        }
            
        return null;
    }
}
