public class FixedSizeRobot implements Robot {
    private final String robotTypeCreated;

    public FixedSizeRobot() {
        this.robotTypeCreated = "A robot with fixed size craeted. ";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String str) {
        System.out.println(" with blue (default) color");
    }
}
