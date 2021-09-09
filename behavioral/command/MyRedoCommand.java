public class MyRedoCommand implements Command {
    private CustomReceiver receiver;

    public MyRedoCommand(CustomReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToRedo();
        receiver.performRedo();
    }
}
