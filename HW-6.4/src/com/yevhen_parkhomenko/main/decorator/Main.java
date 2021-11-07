package com.yevhen_parkhomenko.main.decorator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        {
            // Create ConcreteComponent and two Decorators
            Toys c = new Toys();
            ChristmasTree n1 = new ChristmasTree();

            // Link decorators
            n1.SetComponent(c);

            n1.Operation();

            n1.Operation();
        }
    }}