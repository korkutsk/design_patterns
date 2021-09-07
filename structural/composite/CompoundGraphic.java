import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> graphics;

    public CompoundGraphic() {
        this.graphics = new ArrayList<>();
    }

    public void addGraphic(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void move(double x, double y) {
        graphics.forEach(graphic -> graphic.move(x, y));
    }

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }
}
