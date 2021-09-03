public class Rectangle implements RectangleInterface {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Rectangle object with length: " + this.getLength()
                + " unit and width :" + this.getWidth() + " unit.");
    }

    @Override
    public double calculateAreaOfRectangle() {
        return this.getLength() * this.getWidth();
    }
}
