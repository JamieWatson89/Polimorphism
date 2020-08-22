package com.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String startCar() {
        return "Mitsubishi -> startCar()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brakeType() {
        return "Mitsubishi -> brakeType()";
    }
}
