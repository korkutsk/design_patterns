import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Employee> employees = new ArrayList<>();

    public void displayRegisteredEmployees() {
        System.out.println("Registered users: ");
        employees.forEach(employee -> System.out.println(employee.getName()));
    }

    @Override
    public void register(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void sendMessage(Employee from, Employee to, String message) {
        if (from.employeeType().equals("Unauthorized")) {
            from.receive(from, "Not permitted operation");
        } else if (employees.contains(from) && employees.contains(to)) {
            to.receive(from, message);
        }
    }
}
