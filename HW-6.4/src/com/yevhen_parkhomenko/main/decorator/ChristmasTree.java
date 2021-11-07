package com.yevhen_parkhomenko.main.decorator;

public class ChristmasTree extends Decorator
{
    private boolean doGlow;

    public ChristmasTree() {
        this.doGlow = false;
    }

    @Override
    public void Operation()
    {
        super.Operation();
        AddedBehavior();
        System.out.println("GLOWS: " + doGlow);
    }

    void AddedBehavior() {
        doGlow = !doGlow;
    }
}