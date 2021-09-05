public class BuilderExample {
    public static void main(String[] args) {
        Builder builder = new LaptopBuilder();
        Director director = new Director();
        director.setBuilder(builder);
        director.construct();
    }
}
