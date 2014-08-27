package FactoryPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public abstract class Car {


    CarType model;

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    public abstract void construct();

    private void arrangeParts() {
        System.out.println("Arranging Parts");
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
