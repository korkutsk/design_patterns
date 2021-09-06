import java.util.Random;

public class FlyweightExample {
    public static void main(String[] args) throws Exception {
        RobotFactory factory = new RobotFactory();
        Robot robot;
        for (int i = 0; i < 5; i++) {
            robot = RobotFactory.getRobotFromFactory("small");
            robot.showMe(getColor());
        }
    }

    public static String getColor() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            return "red";
        } else {
            return "blue";
        }
    }
}
