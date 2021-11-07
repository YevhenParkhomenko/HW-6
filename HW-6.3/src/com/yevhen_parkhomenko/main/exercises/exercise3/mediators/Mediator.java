package com.yevhen_parkhomenko.main.exercises.exercise3.mediators;

import com.yevhen_parkhomenko.main.exercises.exercise3.colleagues.Colleague;

public abstract class Mediator {
    public abstract void Send(String message, Colleague colleague);
}