package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.setQuackBehaviour(new Squeak());
        this.setFlyBehaviour(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I am ReadHead Duck");

    }

}
