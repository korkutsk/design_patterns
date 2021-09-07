public class OperationContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int a, int b) {
        if (strategy != null) {
            strategy.execute(a, b);
        }
    }
}
