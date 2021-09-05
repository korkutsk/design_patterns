public abstract class Bottle {
    private String color;

    public Bottle(String color) {
        this.color = color;
    }

    public void drink() {
        System.out.println("Drunk from " + color + " Bottle");
    }

    public abstract Bottle cloneOb();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
