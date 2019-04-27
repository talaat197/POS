/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author sheko
 */
public class Composite {
    
    Employee manager;
    //shop manager
    Employee sectionManager1;
    Employee sectionManager2;
    //manager for specific area in shop
    Employee sales1;
    Employee sales2;
    Employee sales3;
    //just sales (contact with customer)
    
    /**
     * Constructor (initialize objects and add subordinates for each one)
     */
    public Composite()
    {
        //define manager
        manager = new Employee("Manager" , 1000);
        //define section mangers
        sectionManager1 = new Employee("Section Manager 1" , 500);
        sectionManager2 = new Employee("Section Manager 2" , 500);
        //define sales
        sales1 = new Employee("sales 1" , 100);
        sales2 = new Employee("sales 2" , 100);
        sales3 = new Employee("sales 3" , 100);
        
        //add subordinates from manager
        manager.add(sectionManager1);
        manager.add(sectionManager2);
        //add subordinates from section manager 1 (sales 1,2)
        sectionManager1.add(sales1);
        sectionManager1.add(sales2);
        //add subordinates from section manager 2 (sales 3)
        sectionManager2.add(sales3);
   
        System.out.println("level 1  :" + manager.employeeToString());
        System.out.println("--------------------------------");
        //print subordinates employees
        for (Employee head : manager.getSubordinates()) {
         System.out.println("level 2  :" + head.employeeToString());
         System.out.println("--------------------------------");

         for (Employee employee : head.getSubordinates()) {
            System.out.println("Subordinates  :" + employee.employeeToString());
            System.out.println("--------------------------------");
         }
        }	
    }
}
