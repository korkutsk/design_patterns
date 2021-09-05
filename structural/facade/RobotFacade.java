public class RobotFacade {
    private RobotFabric fabric;

    public RobotFacade(RobotFabric fabric) {
        this.fabric = fabric;
    }

    public void createRobot() {
        RobotParts parts = new RobotParts();
        parts.createBody();
        parts.createHands();
        parts.createHands();
        fabric.checkAllParts();
        fabric.buildModel();
        fabric.insertBrain();
    }
}
