public interface Mediator {
    void register(Employee employee);
    void sendMessage(Employee from, Employee to, String message);
}
