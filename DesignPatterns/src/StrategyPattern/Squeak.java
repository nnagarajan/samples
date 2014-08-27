package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak! Squeak!");
    }
}
