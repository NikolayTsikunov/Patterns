package by.my.study.ducks.classes;

import by.my.study.ducks.interfaces.realisations.fly.FlyNoWay;
import by.my.study.ducks.interfaces.realisations.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
