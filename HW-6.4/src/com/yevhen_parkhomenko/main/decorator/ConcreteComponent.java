package com.yevhen_parkhomenko.main.decorator;

public class ConcreteComponent extends Component
{
    @Override
    public void Operation()
    {
        System.out.println("ConcreteComponent.Operation()");
    }
}