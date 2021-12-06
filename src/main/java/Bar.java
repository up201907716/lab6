import java.util.*;

public abstract class Bar {
    /** FIELDS **/
    private List<BarObserver> observers;
    private boolean happyHour;

    public Bar(){
        happyHour = false;
        observers = new ArrayList<>();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour())
                observer.happyHourStarted(this);
            else
                observer.happyHourEnded(this);
    }

    /** METHODS **/
    public boolean isHappyHour() {
        return happyHour;
    }
    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }
    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }
}
