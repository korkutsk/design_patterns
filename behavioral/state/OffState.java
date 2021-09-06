public class OffState implements State {
    private Context context;

    public OffState(Context context) {
        this.context = context;
    }

    @Override
    public void switchOn() {
        System.out.println("On");
        context.setState(new OnState(context));
    }

    @Override
    public void switchOff() {
        System.out.println("Do nothing, already  off. ");
    }

    @Override
    public void act() {
        System.out.println("You are off. ");
    }
}
