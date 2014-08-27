package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class FlyWithNoWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Don't Fly");
    }
}
