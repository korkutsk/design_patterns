public class AddStrategy implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println("Result " + (a + b));
    }
}
