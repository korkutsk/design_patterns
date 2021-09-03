public class TriangleAdapter implements RectangleInterface {
    private Triangle triangle;

    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutRectangle() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateAreaOfRectangle() {
        return triangle.calculateAreaOfTriangle();
    }
}
