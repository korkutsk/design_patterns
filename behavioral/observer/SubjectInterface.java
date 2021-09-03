public interface SubjectInterface {
    void register(EventType eventType, Observer observer);
    void unregister(EventType eventType, Observer observer);
    void notifyObservers(EventType eventType, String bookName);
}