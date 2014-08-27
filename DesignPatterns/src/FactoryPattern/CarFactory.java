package FactoryPattern;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Naveen on 8/25/14.
 */
public class CarFactory {


    static Map<CarType, Class<? extends Car>> cars;

    static {
        cars=new HashMap<CarType, Class<? extends Car>>(5);
    }

    public static Car buildCar(CarType model) {
        if (model.equals(CarType.LUXURY))
            return new LuxuryCar();
        else if (model.equals(CarType.SMALL))
            return new SmallCar();
        else if (model.equals(CarType.SEDAN))
            return new SedanCar();
        else
            return null;

    }

    public static Car buildCarDynamically(CarType carType) throws IllegalAccessException, InstantiationException {
        System.out.println("Printing Carrs"+cars);
        return cars.get(carType).newInstance();
    }

    public static void registerCar(CarType carType, Class c) {
        cars.put(carType, c);
    }


}
