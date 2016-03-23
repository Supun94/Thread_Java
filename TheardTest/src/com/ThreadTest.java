/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author PROMODA
 */
public class ThreadTest {

    public static void main(String[] args) {
        Car car = new Car();
        
        Car car1 = new Car("Ferrari");
        Car car2 = new Car("Mazda");
        Car car3 = new Car("Benz");

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car1);
        Thread t3 = new Thread(car2);

        t1.start();
        t2.start();
        t3.start();
        
    }
}

