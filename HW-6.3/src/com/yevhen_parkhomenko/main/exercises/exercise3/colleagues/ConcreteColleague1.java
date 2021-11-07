package com.yevhen_parkhomenko.main.exercises.exercise3.colleagues;

import com.yevhen_parkhomenko.main.exercises.exercise3.mediators.Mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.Send(message, this);
    }

    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }

}