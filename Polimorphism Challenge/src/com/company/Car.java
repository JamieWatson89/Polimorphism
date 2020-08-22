package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Car {

    private boolean engine ;
    private int cylinders ;
    private int wheels ;
    private String name;


    public Car(int cylinders,String name) {

        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startCar(){
        return "Car -> startCar() ";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brakeType(){
        return "Car -> brakeType()";
    }

}
