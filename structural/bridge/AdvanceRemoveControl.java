public class AdvanceRemoveControl extends RemoteControl {

    public AdvanceRemoveControl(Device device) {
        super(device);
    }

    public void tornOff() {
        this.device.disable();
    }
}
