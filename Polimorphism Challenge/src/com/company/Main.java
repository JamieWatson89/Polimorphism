package com.company;

public class Main {

    public static void main(String[] args) {
          Car car = new Car(4,"Car");
	      Bmw bmw = new Bmw(8,"335i");
	      Mercedes mercedes = new Mercedes(12,"SLS");
	      Mitsubishi mitsubishi = new Mitsubishi(4,"Evo IX");

        System.out.println(car.startCar());
        System.out.println(car.accelerate());
        System.out.println(car.brakeType());
        System.out.println("");
        System.out.println(bmw.startCar());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brakeType());
        System.out.println("");
        System.out.println(mercedes.startCar());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brakeType());
        System.out.println("");
        System.out.println(mitsubishi.startCar());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brakeType());

    }
}
