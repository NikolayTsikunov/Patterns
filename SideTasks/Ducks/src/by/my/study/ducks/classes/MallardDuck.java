package by.my.study.ducks.classes;

import by.my.study.ducks.interfaces.realisations.fly.FlyWithWings;
import by.my.study.ducks.interfaces.realisations.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
