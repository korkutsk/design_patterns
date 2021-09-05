public class PrototypeExample {
    public static void main(String[] args) {
        ColoredBottle bottle = new ColoredBottle("red", 2);
        Bottle newColorBottle = bottle.cloneOb();
        newColorBottle.setColor("blue");
        bottle.drink();
        newColorBottle.drink();
    }
}
