package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
