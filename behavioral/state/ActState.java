public class ActState implements State {
    private Context context;

    public ActState(Context context) {
        this.context = context;
    }

    @Override
    public void switchOn() {
        System.out.println("Do nothing, already  on. ");
    }

    @Override
    public void switchOff() {
        System.out.println("Off. ");
        context.setState(new OffState(context));
    }

    @Override
    public void act() {
        System.out.println("Do nothing, already  act. ");
    }
}
