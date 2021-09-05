public class ConcreteEmployee extends Employee {

    public ConcreteEmployee(String name, boolean isAuthorized, Mediator mediator) {
        super(name, isAuthorized, mediator);
    }

    @Override
    public String employeeType() {
        return "Authorized";
    }
}
