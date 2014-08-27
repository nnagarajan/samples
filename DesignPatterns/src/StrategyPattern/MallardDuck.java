package StrategyPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.setFlyBehaviour(new FlyWithWings());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");

    }

}
