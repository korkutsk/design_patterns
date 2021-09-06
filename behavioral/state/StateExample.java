public class StateExample {
    public static void main(String[] args) {
        Context context = new Context();
        State initState = new OffState(context);
        context.setState(initState);
        context.act();
        context.on();
        context.act();
        context.act();
        context.off();
    }
}
