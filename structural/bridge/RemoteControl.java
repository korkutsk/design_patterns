public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    private void toggleDevice() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }
}
