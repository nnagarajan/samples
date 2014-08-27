package FactoryPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class LuxuryCar extends Car {

    static {
        CarFactory.registerCar(CarType.LUXURY,LuxuryCar.class);
    }

    public LuxuryCar(){
        super(CarType.LUXURY);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing Luxury Car");
    }
}
