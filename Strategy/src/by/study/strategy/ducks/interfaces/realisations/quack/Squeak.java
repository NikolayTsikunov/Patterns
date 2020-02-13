package by.my.study.strategy.interfaces.realisations.quack;

import by.my.study.strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!!!");
    }
}
