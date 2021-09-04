public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory = new OpelFactory();
        factory.createBike().makeNoisySound();
    }
}
