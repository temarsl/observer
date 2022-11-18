package My;

public interface Observed {

    public void addObserved(Observer o);
    public void removeObserved(Observer o);
    public void notifyObservers();
}
