package My;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observed{
    List<String> hw = new ArrayList<>();
    List<Observer> students = new ArrayList<>();

    public void addHw(String hwork) {
        this.hw.add(hwork);
        notifyObservers();
    }

    public void removeHw(String hw) {
        this.hw.remove(hw);
        notifyObservers();
    }

    @Override
    public void addObserved(Observer o) {
        this.students.add(o);
    }

    @Override
    public void removeObserved(Observer o) {
        this.students.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: students) {
            observer.update(this.hw);
        }
    }
}
