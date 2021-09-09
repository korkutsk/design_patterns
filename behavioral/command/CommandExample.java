public class CommandExample {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        CustomReceiver receiver = new CustomReceiver();
        MyUndoCommand undoCommand = new MyUndoCommand(receiver);
        invoker.setCommand(undoCommand);
        invoker.invokeCommand();
    }
}
