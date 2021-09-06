import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String, Robot> robotFactory = new HashMap<>();

    public int totalObjectCreated() {
        return robotFactory.size();
    }

    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {
        Robot robotCategory = robotFactory.get(robotType);
        if (robotCategory == null) {
            switch (robotType) {
                case "small":
                    robotCategory = new SmallRobot();
                    break;
                case "large":
                    System.out.println();
                    robotCategory = new LargeRobot();
                    break;
                case "fixed":
                    System.out.println();
                    robotCategory = new FixedSizeRobot();
                    break;
                default:
                    throw new Exception("Not such category in our fabric. ");
            }
            robotFactory.put(robotType, robotCategory);
        } else {
            System.out.println("Using existing " + robotType + " robot");
        }

        return robotCategory;
    }
}
