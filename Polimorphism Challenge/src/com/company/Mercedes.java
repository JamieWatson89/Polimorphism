package com.company;

public class Mercedes extends Car {

    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String startCar() {
        return "Mercedes -> startCar()";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate()";
    }

    @Override
    public String brakeType() {
        return "Mercedes -> brakeType()";
    }
}
