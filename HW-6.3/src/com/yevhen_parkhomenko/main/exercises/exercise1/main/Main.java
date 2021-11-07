package com.yevhen_parkhomenko.main.exercises.exercise1.main;

import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Cars;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.Engines;
import com.yevhen_parkhomenko.main.exercises.exercise1.factories.FordFactory;
import com.yevhen_parkhomenko.main.exercises.exercise1.factories.MercedesFactory;
import com.yevhen_parkhomenko.main.exercises.exercise1.factories.ToyotaFactory;
import com.yevhen_parkhomenko.main.exercises.exercise1.interfaces.ICarFactory;

public class Main {

    public static void main(String[] args) {
        ICarFactory carFactory = new ToyotaFactory();
        Cars myCar = carFactory.createCar();
        myCar.getInfo();
        Engines myEngine = carFactory.createEngine();
        myEngine.getPower();

        ICarFactory carFactory2 = new MercedesFactory();
        Cars myCar2 = carFactory2.createCar();
        myCar2.getInfo();
        Engines myEngine2 = carFactory2.createEngine();
        myEngine2.getPower();

        ICarFactory carFactory3 = new FordFactory();
        Cars myCar3 = carFactory3.createCar();
        myCar3.getInfo();
        Engines myEngine3 = carFactory3.createEngine();
        myEngine3.getPower();
    }
}