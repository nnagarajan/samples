package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveen on 8/25/14.
 */
public class DuckSimulator {

    private static List<Duck> buildDucks() {
        List<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new MallardDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());
        return ducks;
    }

    public static void main(String[] args) {
        List<Duck> ducks = buildDucks();
        for (Duck duck : ducks) {
            duck.display();
            duck.performQuack();
            duck.performFly();
            duck.swim();
            if(duck instanceof DecoyDuck){
                System.out.println("Fly Behaviour now being changed");
                duck.setFlyBehaviour(new FlyWithWings());
                duck.performFly();
            }
            System.out.println("#########################");
        }
    }
}
