public class LargeRobot implements Robot {
    private final String robotTypeCreated;

    public LargeRobot() {
        this.robotTypeCreated = "A large robot craeted.";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String str) {
        System.out.println(" with color " + str);
    }
}
