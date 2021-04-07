package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car madaz3 = new Car("Madaz 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car madaz6 = new Car("Madaz 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
