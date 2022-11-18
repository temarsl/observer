package bookF;

public class CurrentConditionsDisplay { // Отображение текущих условий
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public  void display() {
        System.out.println("Текущие условия:" + temperature
                + " градусов " + humidity + "% влажности");
    }
}
