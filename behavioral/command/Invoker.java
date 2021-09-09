public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invokeCommand() {
        if (command != null) {
            command.executeCommand();
        }
    }
}
