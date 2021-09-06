public class OnState implements State {
    private Context context;

    public OnState(Context context) {
        this.context = context;
    }

    @Override
    public void switchOn() {
        System.out.println("Do nothing, already on. ");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off. ");
        context.setState(new OffState(context));
    }

    @Override
    public void act() {
        System.out.println("Act. ");
        context.setState(new ActState(context));
    }
}
