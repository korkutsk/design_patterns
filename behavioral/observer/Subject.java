import java.util.*;

public class Subject implements SubjectInterface{
    private Map<EventType, List<Observer>> observers = new HashMap<>();
    private Map<EventType, List<String>> library = new HashMap<>();

    @Override
    public void register(EventType eventType, Observer observer) {
        List<Observer> observerByEventType = this.observers.get(eventType);
        if (Objects.isNull(observerByEventType)) {
            observerByEventType = new ArrayList<>();
        }
        observerByEventType.add(observer);
        observers.put(eventType, observerByEventType);
    }

    @Override
    public void unregister(EventType eventType, Observer observer) {
        List<Observer> observerByEventType = this.observers.get(eventType);
        if (Objects.isNull(observerByEventType)) {
            return;
        }
        observerByEventType.removeIf(obs -> obs.getId() == observer.getId());
    }

    @Override
    public void notifyObservers(EventType eventType, String bookName) {
        List<String> currentBooks = this.library.get(eventType);
        if (Objects.isNull(currentBooks)) {
            currentBooks = new ArrayList<>();
        }
        currentBooks.add(bookName);
        library.put(eventType, currentBooks);
        List<Observer> allObservers = this.observers.get(eventType);
        if(Objects.nonNull(allObservers)) {
            for (Observer obs : allObservers) {
                obs.update(bookName);
            }
        }
    }
}
