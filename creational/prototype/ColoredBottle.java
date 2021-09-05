public class ColoredBottle extends Bottle {
    private int size;

    public ColoredBottle(String color, int size) {
        super(color);
        this.size = size;
    }

    public ColoredBottle(Bottle bottle) {
        super(bottle.getColor());
    }

    @Override
    public Bottle cloneOb() {
        return new ColoredBottle(this);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
