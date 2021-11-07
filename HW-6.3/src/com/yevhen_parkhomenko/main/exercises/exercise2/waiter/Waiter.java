package com.yevhen_parkhomenko.main.exercises.exercise2.waiter;

import com.yevhen_parkhomenko.main.exercises.exercise2.pizza.Pizza;
import com.yevhen_parkhomenko.main.exercises.exercise2.pizzabuilders.PizzaBuilder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    public void constructPizza(){
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

}