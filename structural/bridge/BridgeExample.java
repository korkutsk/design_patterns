public class BridgeExample {
    public static void main(String[] args) {
        Device device = new DVD();
        AdvanceRemoveControl advanceRemoveControl = new AdvanceRemoveControl(device);
        advanceRemoveControl.tornOff();
    }
}
