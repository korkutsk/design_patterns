public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(Town town) {
        System.out.println("Town population is :: " + town.getPopulation());
        System.out.println("Half is man :: " + town.getPopulation() / 2);
    }
}
