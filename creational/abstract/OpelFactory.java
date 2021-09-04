public class OpelFactory implements AbstractFactory {
    @Override
    public Car createCar() {
        return new OpelCar();
    }

    @Override
    public Bike createBike() {
        return new OpelBike();
    }
}
