package com.ohgiraffers.api.object;

import com.ohgiraffers.api.string.StringProcess;

public class App extends Car {

    public App(String carName, String carColor, int engineCC) {
        super(carName, carColor, engineCC);
    }


    public static void main(String[] args) {

        Car myCar = new Car("Sonata", "검정", 2000);
        Car yourCar = new Car("Sonata", "검정", 2500);

        System.out.println(myCar.equals(yourCar)); // true
        System.out.println(myCar.hashCode() == yourCar.hashCode()); // true

        Car hisCar = new Car("Sonata", "화이트", 2000);
        System.out.println(myCar.equals(hisCar)); // false
        System.out.println(myCar.hashCode() == hisCar.hashCode()); // false
    }
}
