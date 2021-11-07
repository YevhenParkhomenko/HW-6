package com.yevhen_parkhomenko.main.decorator;

class ConcreteDecoratorA extends Decorator
{
    private String newState;

    @Override
    public  void Operation()
    {
        super.Operation();
        newState = "New State";
        System.out.println("ConcreteDecoratorA.Operation()");
    }
}