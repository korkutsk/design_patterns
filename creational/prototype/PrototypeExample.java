public class PrototypeExample {
    public static void main(String[] args) {
        ColoredBottle bottle = new ColoredBottle("red");
        ColoredBottle newColorBottle = bottle.cloneOb();
        newColorBottle.setColor("blue");
        bottle.drink();
        newColorBottle.drink();
    }
}
