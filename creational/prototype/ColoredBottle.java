public class ColoredBottle implements Bottle {
    private String color;

    public ColoredBottle(String color) {
        this.color = color;
    }

    public ColoredBottle(ColoredBottle bottle) {
        this.color = bottle.getColor();
    }


    @Override
    public void drink() {
        System.out.println("Drunk from " + color + " Bottle");
    }

    public String getColor() {
        return color;
    }

    @Override
    public ColoredBottle cloneOb() {
        return new ColoredBottle(this);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
