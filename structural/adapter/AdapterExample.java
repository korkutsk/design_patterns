public class AdapterExample {
    public static void main(String[] args) {
        CalculatorAdapter calculator = new CalculatorAdapter();
        Triangle triangle = new Triangle(2, 5);
        System.out.println(calculator.getArea(triangle));
    }
}
