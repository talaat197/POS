/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.util.Date;

/**
 *
 * @author sheko
 */
public class ChatRoom {
    public static void showMessage(Employee emp, String message){
      System.out.println(new Date().toString() + " [" + emp.getName() + "] : " + message);
   }
}
