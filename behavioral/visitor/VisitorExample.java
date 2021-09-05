public class VisitorExample {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Town town = new Town(2000);
        town.acceptVisitor(visitor);
    }
}
