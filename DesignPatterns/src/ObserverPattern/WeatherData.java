package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveen on 8/25/14.
 */
public class WeatherData implements Subject {
    List<Observer> observers;
    double temperature;
    double pressure;
    double humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>(5);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0)
            observers.remove(i);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,pressure,humidity);
        }

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();

    }


}
