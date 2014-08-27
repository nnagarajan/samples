package ObserverPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    double temperature;
    double humidity;
    double pressure;

    Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject=subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature :" + this.temperature);
        System.out.println("Humidity :" + this.humidity);
        System.out.println("Pressure :" + this.pressure);
    }


    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
