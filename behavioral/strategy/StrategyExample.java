public class StrategyExample {
    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();
        OperationContext context = new OperationContext();
        context.setStrategy(strategy);
        context.executeStrategy(10, 2);
    }
}
