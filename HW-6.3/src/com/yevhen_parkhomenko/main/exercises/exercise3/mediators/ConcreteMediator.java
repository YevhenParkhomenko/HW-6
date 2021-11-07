package com.yevhen_parkhomenko.main.exercises.exercise3.mediators;

import com.yevhen_parkhomenko.main.exercises.exercise3.colleagues.Colleague;
import com.yevhen_parkhomenko.main.exercises.exercise3.colleagues.ConcreteColleague1;
import com.yevhen_parkhomenko.main.exercises.exercise3.colleagues.ConcreteColleague2;

public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;
    public ConcreteColleague1 setColleague1(ConcreteColleague1 value) {
        colleague1 = value;
        return colleague1;
    }
    public ConcreteColleague2 setColleague2(ConcreteColleague2 value) {
        colleague2 = value;
        return colleague2;
    }
    @Override
    public void Send(String message, Colleague colleague) {
        if (colleague == colleague1)
        {
            colleague2.notify(message);
        }
        else
        {
            colleague1.notify(message);
        }

    }
}