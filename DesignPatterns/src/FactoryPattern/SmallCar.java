package FactoryPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class SmallCar extends Car {

    static {
        CarFactory.registerCar(CarType.SMALL,SmallCar.class);
    }

    public SmallCar(){
        super(CarType.SMALL);
        construct();

    }
    @Override
    public void construct() {
        System.out.println("Constructing SMALL Car");

    }
}
