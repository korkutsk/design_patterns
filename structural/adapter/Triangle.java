public class Triangle implements TriangleInterface {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Triangle object with base: " + this.getBase()
                + " unit and height :" + this.getHeight() + " unit.");
    }

    @Override
    public double calculateAreaOfTriangle() {
        return 0.5 * this.getBase() * this.getHeight();
    }
}
