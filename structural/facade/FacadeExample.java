public class FacadeExample {
    public static void main(String[] args) {
        RobotFabric fabric = new RobotFabric();
        RobotFacade facade = new RobotFacade(fabric);
        facade.createRobot();
    }
}
