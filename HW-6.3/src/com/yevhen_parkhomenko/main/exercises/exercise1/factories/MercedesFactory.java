package com.yevhen_parkhomenko.main.exercises.exercise1.factories;

import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Cars;
import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Mercedes;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.Engines;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.MercedesEngine;
import com.yevhen_parkhomenko.main.exercises.exercise1.interfaces.ICarFactory;

public class MercedesFactory implements ICarFactory {
    @Override
    public Cars createCar() {
        return new Mercedes();
    }

    @Override
    public Engines createEngine() {
        return new MercedesEngine();
    }
}