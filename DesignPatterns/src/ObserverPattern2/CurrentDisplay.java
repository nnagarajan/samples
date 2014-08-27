package ObserverPattern2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Naveen on 8/25/14.
 */
public class CurrentDisplay implements Observer, DisplayElement {
    double temperature;
    double humidity;
    double pressure;

    Observable subject;

    public CurrentDisplay(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature :" + this.temperature);
        System.out.println("Humidity :" + this.humidity);
        System.out.println("Pressure :" + this.pressure);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }

    }
}
