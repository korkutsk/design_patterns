public class ObserverExample {
    public static void main(String[] args) {
        SubjectInterface subject = new Subject();
        Observer observer1 = new BookObserver1(1);
        Observer observer2 = new BookObserver2(2);
        subject.register(EventType.CLASSIC, observer1);
        subject.register(EventType.FANTASY, observer2);
        subject.notifyObservers(EventType.CLASSIC, "First love enc");
        subject.notifyObservers(EventType.FANTASY, "The lord of the rings");
        subject.unregister(EventType.CLASSIC, observer1);
        subject.notifyObservers(EventType.CLASSIC, "First love enc v2");
    }
}
