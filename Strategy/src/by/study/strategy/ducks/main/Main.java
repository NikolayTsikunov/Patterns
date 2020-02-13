package by.my.study.strategy.main;

import by.my.study.strategy.classes.Duck;
import by.my.study.strategy.classes.MallardDuck;
import by.my.study.strategy.classes.ModelDuck;
import by.my.study.strategy.interfaces.realisations.fly.FlyRocket;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();

        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocket());
        model.performFly();
    }
}
