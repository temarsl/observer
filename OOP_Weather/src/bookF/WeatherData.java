package bookF;

public class WeatherData {
    float Temperature;
    float Humidity;
    public WeatherData(float temperature, float humidity, float pressure) {
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
    }
    float Pressure;
    public float getTemperature() {
        return Temperature;
    }

    public void setTemperature(float temperature) {
        Temperature = temperature;
    }
    public float getHumidity() {
        return Humidity;
    }

    public void setHumidity(float humidity) {
        Humidity = humidity;
    }

    public float getPressure() {
        return Pressure;
    }

    public void setPressure(float pressure) {
        Pressure = pressure;
    }

    // метод вызывается при каждом oбновлении показаний
    public void measurementsChanged() {
        // получаем новейшие изменения
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        new CurrentConditionsDisplay().update(temp, humidity, pressure); // обновляются экраны
        new StatisticsDisplay().update(temp, humidity, pressure);
        // мы не можем добавлять и удалять визуальные элементы без внесения изменений в прогрумму
        // набор экранов жестко фиксируется
    }
}