package com.yevhen_parkhomenko.main.exercises.exercise1.factories;

import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Cars;
import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Ford;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.Engines;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.FordEngine;
import com.yevhen_parkhomenko.main.exercises.exercise1.interfaces.ICarFactory;

public class FordFactory  implements ICarFactory {
    @Override
    public Cars createCar() {
        return new Ford();
    }

    @Override
    public Engines createEngine() {
        return new FordEngine();
    }
}