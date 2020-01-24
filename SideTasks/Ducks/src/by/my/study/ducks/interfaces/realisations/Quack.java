package by.my.study.ducks.interfaces.realisations;

import by.my.study.ducks.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!!!");
    }
}
