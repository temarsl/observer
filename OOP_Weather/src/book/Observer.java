package book;

public interface Observer { // наблюдатель
    public void update(float temp, float humidity, float pressure);
}
