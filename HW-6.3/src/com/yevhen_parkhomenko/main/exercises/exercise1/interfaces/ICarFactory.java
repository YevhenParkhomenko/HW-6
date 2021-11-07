package com.yevhen_parkhomenko.main.exercises.exercise1.interfaces;

import com.yevhen_parkhomenko.main.exercises.exercise1.cars.Cars;
import com.yevhen_parkhomenko.main.exercises.exercise1.engines.Engines;

public interface ICarFactory {
    Cars createCar();
    Engines createEngine();
}