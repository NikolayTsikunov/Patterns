package by.my.study.ducks.interfaces.realisations;

import by.my.study.ducks.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!!!");
    }
}
