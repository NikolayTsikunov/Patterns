package by.my.study.ducks.interfaces.realisations.fly;

import by.my.study.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
