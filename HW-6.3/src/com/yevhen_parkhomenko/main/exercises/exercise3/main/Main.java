package com.yevhen_parkhomenko.main.exercises.exercise3.main;

import com.yevhen_parkhomenko.main.exercises.exercise3.colleagues.ConcreteColleague1;
import com.yevhen_parkhomenko.main.exercises.exercise3.colleagues.ConcreteColleague2;
import com.yevhen_parkhomenko.main.exercises.exercise3.mediators.ConcreteMediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        m.Send("How are you?", c1);
        m.Send("Fine, thanks", c2);
        c1.send("123");
        c2.send("123");
    }
}