public class SmallRobot implements Robot {
    private final String robotTypeCreated;

    public SmallRobot() {
        this.robotTypeCreated = "A small robot created. ";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String str) {
        System.out.println(" with color " + str);
    }
}
