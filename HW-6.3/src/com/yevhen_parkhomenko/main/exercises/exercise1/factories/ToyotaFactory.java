package com.yevhen_parkhomenko.main.exercises.exercise1.factories;

import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Cars;
import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Toyota;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.Engines;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.ToyotaEngine;
import com.yevhen_parkhomenko.main.exercises.exercise1.interfaces.ICarFactory;

public class ToyotaFactory implements ICarFactory {
    @Override
    public Cars createCar() {
        return new Toyota();
    }

    @Override
    public Engines createEngine() {
        return new ToyotaEngine();
    }
}