package by.my.study.strategy.interfaces.realisations.fly;

import by.my.study.strategy.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
