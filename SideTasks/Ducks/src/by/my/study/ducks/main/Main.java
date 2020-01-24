package by.my.study.ducks.main;

import by.my.study.ducks.classes.Duck;
import by.my.study.ducks.classes.MallardDuck;
import by.my.study.ducks.classes.ModelDuck;
import by.my.study.ducks.interfaces.realisations.FlyRocket;

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
