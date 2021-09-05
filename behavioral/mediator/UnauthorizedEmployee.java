public class UnauthorizedEmployee extends Employee {

    public UnauthorizedEmployee(String name, boolean isAuthorized, Mediator mediator) {
        super(name, isAuthorized, mediator);
    }

    @Override
    public String employeeType() {
        return "Unauthorized";
    }


    @Override
    public void receive(Employee employee, String message) {
        super.receive(employee, message);
    }
}
