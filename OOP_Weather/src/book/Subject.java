package book;

public interface Subject { // наблюдаемый
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
