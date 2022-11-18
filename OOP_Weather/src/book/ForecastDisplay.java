package book;

public class ForecastDisplay implements Observer, DisplayElement {
    float currentPressure;
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Давление: " + currentPressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.currentPressure = pressure;
        display();
    }
}