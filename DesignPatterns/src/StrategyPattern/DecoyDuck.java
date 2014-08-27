package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class DecoyDuck extends  Duck{

    public DecoyDuck(){
        setFlyBehaviour(new FlyWithNoWings());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy");
    }

}
