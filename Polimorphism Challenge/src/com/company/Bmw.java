package com.company;

public class Bmw extends Car {

    public Bmw(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String startCar() {
        return "BMW -> startCar()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brakeType() {
        return "BMW -> brakeType()";
    }
}
