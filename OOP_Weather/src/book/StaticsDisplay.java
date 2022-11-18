package book;

public class StaticsDisplay implements Observer, DisplayElement {

    private float mintemp = 100;
    private float maxtemp = -100;
    private float minhumidity = 100;
    private float maxhumidity = -100;
    private float minpressure = 200;
    private float maxpressure = -200;

    private WeatherData weatherData;

    public StaticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Минимальная температура: " + mintemp);
        System.out.println("Максимальная температура: " + maxtemp);
        System.out.println("Максимальная влажность: " + maxhumidity);
        System.out.println("Минимальная влажность: " + minhumidity);
        System.out.println("Минимальное давление: " + minpressure);
        System.out.println("Максимальное давление: " + maxpressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (maxtemp < temp) {
            maxtemp = temp;
        }
        if (mintemp > temp) {
            mintemp = temp;
        }
        if (minhumidity > humidity) {
            minhumidity = humidity;
        }
        if (maxhumidity < humidity) {
            maxhumidity = humidity;
        }
        if (maxpressure < pressure) {
            maxpressure = pressure;
        }
        if (minpressure > pressure) {
            minpressure = pressure;
        }
        display();
    }
}
