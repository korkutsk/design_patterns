import java.util.Objects;

public abstract class Employee {
    private String name;
    private boolean isAuthorized;
    private Mediator mediator;

    public Employee(String name, boolean isAuthorized, Mediator mediator) {
        this.name = name;
        this.isAuthorized = isAuthorized;
        this.mediator = mediator;
        if (isAuthorized) {
            mediator.register(this);
        }
    }

    public abstract String employeeType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void send(Employee employee, String message) {
        mediator.sendMessage(this, employee, message);
    }

    public void receive(Employee employee, String message) {
        System.out.println("Received message from :: " + employee.getName() + " :: " + message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return isAuthorized == employee.isAuthorized && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isAuthorized, mediator);
    }
}
