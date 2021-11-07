package com.yevhen_parkhomenko.main.exercises.exercise2.pizzabuilders;

public class MargaritaPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("fresh tomatoes + basil + garlic + flat-leaf parsley + olive oil");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("mozzarella cheese + tomato sauce + and basil");
    }
}