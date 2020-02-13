package by.my.study.strategy.interfaces.realisations.quack;

import by.my.study.strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
