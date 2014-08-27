package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        setFlyBehaviour(new FlyWithNoWings());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }

}
