package ObserverPattern;

/**
 * Created by Naveen on 8/25/14.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
