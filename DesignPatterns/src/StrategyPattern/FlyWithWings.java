package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
