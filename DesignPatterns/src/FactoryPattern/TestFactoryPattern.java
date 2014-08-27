package FactoryPattern;


/**
 * Created by Naveen on 8/25/14.
 */
public class TestFactoryPattern {
    public static void main(String[] args) {
        //CarFactory.buildCar(CarType.SEDAN);



        try {
            Class.forName("FactoryPattern.SedanCar");
            CarFactory.buildCarDynamically(CarType.SEDAN);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
