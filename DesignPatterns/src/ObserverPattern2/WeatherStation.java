package ObserverPattern2;

/**
 * Created by Naveen on 8/25/14.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(120.05,62.00,35.03);
        weatherData.setMeasurements(170.20,61.03,23.009);

    }
}
