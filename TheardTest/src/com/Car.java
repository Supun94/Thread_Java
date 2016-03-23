/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PROMODA
 */
class Car implements Runnable{
    private String name;
    
    public Car(){
        this("Genaric Car...");
    }
    
    public Car(String name){
        this.name = name;
        System.out.println("Constructor one is : "+this.name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name+" is happening");
                Thread.sleep(500L);
            } catch (InterruptedException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
}
