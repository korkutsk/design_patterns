public class CalculatorAdapter {

    public double getArea(Triangle triangle) {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(triangle.getBase());
        rectangle.setWide(triangle.getHeight() * 0.5);
        return calculator.getArea(rectangle);
    }
}
