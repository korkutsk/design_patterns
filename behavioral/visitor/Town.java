public class Town implements OriginalInterface {
    private int population;

    public Town(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }


    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
