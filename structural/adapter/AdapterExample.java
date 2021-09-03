public class AdapterExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 20);
        Triangle triangle = new Triangle(10, 5);
        RectangleInterface adapter = new TriangleAdapter(triangle);
        adapter.aboutRectangle();
        System.out.println(adapter.calculateAreaOfRectangle());
    }
}
