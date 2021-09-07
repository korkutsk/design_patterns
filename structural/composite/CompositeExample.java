public class CompositeExample {
    public static void main(String[] args) {
        CompoundGraphic graphic = new CompoundGraphic();
        graphic.addGraphic(new Dot(1, 2));
        graphic.addGraphic(new Dot(4, -5));

        graphic.draw();
    }
}
