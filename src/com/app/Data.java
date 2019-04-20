package com.app;

import java.util.HashMap;

/**
 *
 * @author Ahmedkhaled
 */
public class Data {
    // static variable single_instance of type Singleton
    private static Data single_instance = null;

    // variable of type String
    public String result;
    // Create a HashMap object called Product
    public HashMap<String, String> products = new HashMap<String, String>();

    // private constructor restricted to this class itself
    private Data()
    {
        products.put("100", "Samsung Chromebook (Wi-Fi, 11.6-Inch) - Silver (Renewed)");
        products.put("101", "Corsair Gaming K65 LUX RGB Compact Mechanical Keyboard (Renewed)");
        products.put("102", "Dell OptiPlex - Core 2 Duo E8400 3 GHz - New 4GB Memory");
        products.put("103", "Apple MacBook Pro MD101LL/A 13.3-inch Laptop");
        products.put("104", "HP 8300 Elite Small Form Factor Desktop Computer");
        products.put("105", "Apple MacBook Air MJVM2LL/A Intel i5");
        products.put("109", "Rebuilt HP 4250DN");

        result = null;
    }

    // static method to create instance of Singleton class
    public static Data getInstance()
    {
        if (single_instance == null)
            single_instance = new Data();
        return single_instance;
    }

}
