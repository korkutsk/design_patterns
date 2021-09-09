public class MyUndoCommand implements Command {
    private CustomReceiver receiver;

    public MyUndoCommand(CustomReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToUndo();
        receiver.performUndo();
    }
}
