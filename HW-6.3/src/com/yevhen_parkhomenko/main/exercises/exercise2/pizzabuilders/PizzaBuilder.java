package com.yevhen_parkhomenko.main.exercises.exercise2.pizzabuilders;

import com.yevhen_parkhomenko.main.exercises.exercise2.pizza.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza;
    public PizzaBuilder() { }
    public Pizza getPizza() { return pizza; }
    public void createNewPizza() { pizza = new Pizza(); }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}