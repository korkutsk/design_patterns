public class FordFactory implements AbstractFactory {
    @Override
    public Car createCar() {
        return new FordCar();
    }

    @Override
    public Bike createBike() {
        return new FordBike();
    }
}
