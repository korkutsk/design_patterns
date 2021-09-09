public class CustomReceiver {
    public void performUndo() {
        System.out.println("Receiver :: undo operation. ");
    }

    public void performRedo() {
        System.out.println("Receiver :: redo operation. ");
    }

    public void doOptionalTaskPriorToUndo() {
        System.out.println("Receiver :: Optional undo operation. ");
    }

    public void doOptionalTaskPriorToRedo() {
        System.out.println("Receiver :: Optional redo operation. ");
    }
}
