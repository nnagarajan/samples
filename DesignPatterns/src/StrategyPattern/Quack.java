package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
