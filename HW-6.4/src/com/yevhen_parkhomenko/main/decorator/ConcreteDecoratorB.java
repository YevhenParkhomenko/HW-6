package com.yevhen_parkhomenko.main.decorator;

class ConcreteDecoratorB extends Decorator
{
    @Override
    public void Operation()
    {
        super.Operation();
        AddedBehavior();
        System.out.println("ConcreteDecoratorB.Operation()");
    }
    void AddedBehavior() {

    }
}