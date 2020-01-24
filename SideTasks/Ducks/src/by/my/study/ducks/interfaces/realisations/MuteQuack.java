package by.my.study.ducks.interfaces.realisations;

import by.my.study.ducks.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
