/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sheko
 */
public class Employee {
    private String name;
    //Employee name
    private int salary;
    //Employee salay
    private List<Employee> subordinates;
    //list of subordinates that employee manage them
    
    /**
     * constructor for initializing object
     * Employee
     * @param _name
     * @param _salary
     */
    public Employee(String _name , int _salary)
    {
        this.name = _name;
        this.salary = _salary;
        subordinates = new ArrayList<Employee>();
    }
    
    /**
     * to add employee in list of subordinates
     * add
     * @param emp 
     */
    public void add(Employee emp)
    {
        subordinates.add(emp);
    }
    
    /**
     * to remove employee from list of subordinates
     * remove
     * @param emp 
     */
    public void remove(Employee emp)
    {
        subordinates.remove(emp);
    }
    
    /**
     * return list of subordinates employees
     * getSubordinates
     * @return List 
     */
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    
    /**
     * employeeToString
     * @return employee to string
     */
    public String employeeToString(){
      return ("Employee :[ Name : " + name + ", salary :" + salary+" ]");
    }   
    
    /**
     * return name of employees
     * getName
     * @return 
     */
    public String getName()
    {
        return this.name;
    }
    
    //used to send message to chatgroup
    public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}
