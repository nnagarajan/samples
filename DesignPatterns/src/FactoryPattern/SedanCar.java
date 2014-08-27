package FactoryPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class SedanCar extends Car {
    static {
        CarFactory.registerCar(CarType.SEDAN,SedanCar.class);
    }
    public SedanCar(){
        super(CarType.SEDAN);
        construct();
    }
    @Override
    public void construct() {
        System.out.println("Constructing SEDAN Car");
    }
}
