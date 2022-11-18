package bookF;

public class StatisticsDisplay {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Средняя/Максимальная/Минимальная температура = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
