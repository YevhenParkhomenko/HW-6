package com.yevhen_parkhomenko.main.exercises.exercise3.colleagues;

import com.yevhen_parkhomenko.main.exercises.exercise3.mediators.Mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator)
    {
        this.mediator = mediator;
    }

}