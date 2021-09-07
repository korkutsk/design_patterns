public class Circle extends Dot {
    private double x, y;
    private int radius;

    public Circle(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("You are at (" + x + ", " + y + ") with radius " + radius);
    }
}
